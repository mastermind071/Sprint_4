package tests;

import pages.OrderPage;
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
        pageOrder1.cookieAccept();//вызов метода , подтверждающего куки
        pageOrder1.clickOrder();//вызов метода , нажимающего на кнопку "заказать" на главной странице
        pageOrder1.firstPageOrder();//вызов метода, объединяющий несколько методов на первой странице оформления заказа
        pageOrder1.clickNextPage();//вызов метода , нажимающий на переход на следующую страницу оформления заказа
        pageOrder1.secondPageOrder();//вызов метода, объединяющий несколько методов на второй странице оформления заказа
        pageOrder1.makeOrder();//вызов метода, оформляющий заказ на второй странице оформления заказ
    }

    @After
    public void teardown() {
        driver.quit();//метод, закрывающий браузер
    }
}