package TestClass;

import Pages.PageMain;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class ImportantTest {
    private WebDriver driver;

    @Test
    public void TestImportant() {
        System.setProperty("webdriver.chrome.driver", "/users/anastasia/downloads/WebDriver/bin/chromedriver");
        WebDriver driver = new ChromeDriver();// драйвер для браузера Chrome
        driver.get("https://qa-scooter.praktikum-services.ru/");// переход на страницу тестового приложения
        PageMain importantPage = new PageMain(driver);//создание нового класcа
        String expectedTextInTheFirstQuestion = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";//ожидающий результат в ответе на первый вопрос в блоке "вопросы и ответы"
        String expectedTextInTheSecondAnswer = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";//ожидающий результат в ответе на второй вопрос в блоке "вопросы и ответы"
        String expectedTextInTheThirdAnswer = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";//ожидающий результат в ответе на третий вопрос в блоке "вопросы и ответы"
        String expectedTextInTheFourthAnswer = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";//ожидающий результат в ответе на четвертый вопрос в блоке "вопросы и ответы"
        String expectedTextInTheFifthAnswer = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";//ожидающий результат в ответе на пятый вопрос в блоке "вопросы и ответы"
        String expectedTextInTheSixthAnswer = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";//ожидающий результат в ответе на шестой вопрос в блоке "вопросы и ответы"
        String expectedTextInTheSeventhAnswer = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";//ожидающий результат в ответе на седьмой вопрос в блоке "вопросы и ответы"
        String expectedTextInTheEiqhtAnswer = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";//ожидающий результат в ответе на восьмой вопрос в блоке "вопросы и ответы"

        importantPage.cookieAccept();//вызывает метод принимающйи куки
        importantPage.checkFirstQuestion();//вызывает метод, объединяющий скролл вниз до конца и выбирающий первый вопрос в блоке "вопросы и ответы"
        String actualTextInTheFirstAnswer = importantPage.getTextFirstAnswer();//вызывает метод получения текста на первый ответ
        assertEquals("В первом вопросе должен быть другой текст", expectedTextInTheFirstQuestion, actualTextInTheFirstAnswer);//сравнение строк ожидания и фактического результата
        importantPage.secondQuestionSelect();//вызывает метод нажатия на второй вопрос
        String actualTextInTheSecondAnswer = importantPage.getTextSecondAnswer();//вызывает метод получения текста на второй ответ
        assertEquals("Во втором ответе должен быть другой текст", expectedTextInTheSecondAnswer, actualTextInTheSecondAnswer);
        importantPage.thirdQuestionSelect();//вызывает метод нажатия на третий вопрос
        String actualTextInTheThirdAnswer = importantPage.getTextThirdAnswer();//вызывает метод получения текста на третий ответ
        assertEquals("В третье ответе должен быть другой текст", expectedTextInTheThirdAnswer, actualTextInTheThirdAnswer);
        importantPage.fourthQuestionSelect();//вызывает метод нажатия на четвертый вопрос
        String actualTextInTheFourthAnswer = importantPage.getTextFourthAnswer();//вызывает метод получения текста на четвертый ответ
        assertEquals("В четвертом ответе должен быть другой текст", expectedTextInTheFourthAnswer, actualTextInTheFourthAnswer);
        importantPage.fifthQuestionSelect();//вызывает метод нажатия на пятый вопрос
        String actualTextInTheFifthAnswer = importantPage.getTextFifthAnswer();//вызывает метод получения текста на пятый ответ
        assertEquals("В пятом ответе должен быть другой текст", expectedTextInTheFifthAnswer, actualTextInTheFifthAnswer);
        importantPage.sixthQuestionSelect();//вызывает метод нажатия на шестой вопрос
        String actualTextInTheSixthAnswer = importantPage.getTextSixthAnswer();//вызывает метод получения текста на шестой ответ
        assertEquals("В шестом ответе должен быть другой текст", expectedTextInTheSixthAnswer, actualTextInTheSixthAnswer);
        importantPage.seventhQuestionSelect();//вызывает метод нажатия на седьмой вопрос
        String actualTextInTheSeventhAnswer = importantPage.getTextSeventhAnswer();//вызывает метод получения текста на седьмой ответ
        assertEquals("В седьмом ответе должен быть другой текст", expectedTextInTheSeventhAnswer, actualTextInTheSeventhAnswer);
        importantPage.eightQuestionSelect();//вызывает метод нажатия на восьмой вопрос
        String actualTextInTheEiqhtAnswer = importantPage.getTextEightAnswer();//вызывает метод получения текста на восьмой ответ
        assertEquals("В восьмом ответе должен быть другой текст", expectedTextInTheEiqhtAnswer, actualTextInTheEiqhtAnswer);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
