package TestClass;
import Pages.OrderPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Test;


public class OrderTest {
    private WebDriver driver;

    @Test
    public void TestOrder() {
        System.setProperty("webdriver.chrome.driver", "/users/anastasia/downloads/WebDriver/bin/chromedriver");
        driver = new ChromeDriver();// драйвер для браузера Chrome
        driver.get("https://qa-scooter.praktikum-services.ru/");// переход на страницу тестового приложения
        OrderPage pageOrder1 = new OrderPage(driver);//создание нового класcа
        pageOrder1.CookieAccept();//вызов метода , подтверждающего куки
        pageOrder1.ClickOrder();//вызов метода , нажимающего на кнопку "заказать" на главной странице
        pageOrder1.FirstPageOrder();//вызов метода, объединяющий несколько методов на первой странице оформления заказа
        pageOrder1.ClickNextPage();//вызов метода , нажимающий на переход на следующую страницу оформления заказа
        pageOrder1.SecondPageOrder();//вызов метода, объединяющий несколько методов на второй странице оформления заказа
        pageOrder1.MakeOrder();//вызов метода, оформляющий заказ на второй странице оформления заказ
    }

    @After
    public void teardown() {
        driver.quit();//метод, закрывающий браузер
    }
}