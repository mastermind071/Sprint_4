package TestClass;
import Pages.PageMain;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class ImportantTest{
    private WebDriver driver;
    @Test
    public void TestImportant() {
        System.setProperty("webdriver.chrome.driver","/users/anastasia/downloads/WebDriver/bin/chromedriver");
        WebDriver driver = new ChromeDriver();// драйвер для браузера Chrome
        driver.get("https://qa-scooter.praktikum-services.ru/");// переход на страницу тестового приложения
        PageMain importantPage = new PageMain(driver);//создание нового класcа
        importantPage.CookieAccept();//вызывает метод принимающйи куки
        importantPage.CheckFirstQuestion();//вызывает метод, объединяющий скролл вниз до конца и выбирающий первый вопрос в блоке "вопросы и ответы"
       String actualTextInTheFirstAnswer = importantPage.GetTextFirstAnswer();//получает в строковом виде метод, получающий текст в ответе на первый вопрос
       String expectedTextInTheFirstQuestion = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";//ожидающий результат в ответе на первый вопрос в блоке "вопросы и ответы"
        assertEquals("В первом вопросе должен быть другой текст", actualTextInTheFirstAnswer, expectedTextInTheFirstQuestion);//сравнение строк ожидания и фактического результата

        importantPage.SecondQuestionSelect();
        String actualTextInTheSecondAnswer = importantPage.GetTextSecondAnswer();
        String expectedTextInTheSecondAnswer = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        assertEquals("Во втором ответе должен быть другой текст", actualTextInTheSecondAnswer, expectedTextInTheSecondAnswer);

        importantPage.ThirdQuestionSelect();
        String actualTextInTheThirdAnswer = importantPage.GetTextThirdAnswer();
        String expectedTextInTheThirdAnswer = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        assertEquals("В третье ответе должен быть другой текст", actualTextInTheThirdAnswer, expectedTextInTheThirdAnswer);

        importantPage.FourthQuestionSelect();
        String actualTextInTheFourthAnswer = importantPage.GetTextFourthAnswer();
        String expectedTextInTheFourthAnswer = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        assertEquals("В четвертом ответе должен быть другой текст", actualTextInTheFourthAnswer, expectedTextInTheFourthAnswer);

        importantPage.FifthQuestionSelect();
        String actualTextInTheFifthAnswer = importantPage.GetTextFifthAnswer();
        String expectedTextInTheFifthAnswer = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        assertEquals("В пятом ответе должен быть другой текст", actualTextInTheFifthAnswer, expectedTextInTheFifthAnswer);

        importantPage.SixthQuestionSelect();
        String actualTextInTheSixthAnswer = importantPage.GetTextSixthAnswer();
        String expectedTextInTheSixthAnswer = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        assertEquals("В шестом ответе должен быть другой текст", actualTextInTheSixthAnswer, expectedTextInTheSixthAnswer);

        importantPage.SeventhQuestionSelect();
        String actualTextInTheSeventhAnswer = importantPage.GetTextSeventhAnswer();
        String expectedTextInTheSeventhAnswer = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        assertEquals("В седьмом ответе должен быть другой текст", actualTextInTheSeventhAnswer, expectedTextInTheSeventhAnswer);

        importantPage.EightQuestionSelect();
        String actualTextInTheEiqhtAnswer = importantPage.GetTextEightAnswer();
        String expectedTextInTheEiqhtAnswer = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        assertEquals("В восьмом ответе должен быть другой текст",actualTextInTheEiqhtAnswer, expectedTextInTheEiqhtAnswer);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
