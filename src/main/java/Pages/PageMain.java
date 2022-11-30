package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

public class PageMain {
    private WebDriver driver;
    private By acceptCookie = By.id("rcc-confirm-button");//локатор для кнопки "принять куки"
    private By firstQuestion = By.id("accordion__heading-0");//локатор для первого вопроса в блоке "вопросы и ответы"
    private By firstAnswer = By.xpath(".//div[@id='accordion__panel-0']/p");//локатор для ответа на первый вопрос
    private By secondQuestion = By.id("accordion__heading-1");//локатор для второго вопроса в блоке "вопросы и ответы"
    private By secondAnswer = By.xpath(".//div[@id='accordion__panel-1']");//локатор для ответа на второй вопрос
    private By thirdQuestion = By.id("accordion__heading-2");//локатор для третьего вопроса в блоке "вопросы и ответы"
    private By thirdAnswer = By.xpath(".//div[@id='accordion__panel-2']/p");//локатор для ответа на третий вопрос
    private By fourthQuestion = By.id("accordion__heading-3");//локатор для четвертого вопроса в блоке "вопросы и ответы"
    private By fourthAnswer = By.xpath(".//div[@id='accordion__panel-3']/p");//локатор для ответа на четвертый вопрос
    private By fifthQuestion = By.id("accordion__heading-4");//локатор для пятого вопроса в блоке "вопросы и ответы"
    private By fifthAnswer = By.xpath(".//div[@id='accordion__panel-4']/p");//локатор для пятый на первый вопрос
    private By sixthQuestion = By.id("accordion__heading-5");//локатор для шестого вопроса в блоке "вопросы и ответы"
    private By sixthAnswer = By.xpath(".//div[@id='accordion__panel-5']/p");//локатор для ответа на шестой вопрос
    private By seventhQuesstion = By.id("accordion__heading-6");//локатор для седьмого вопроса в блоке "вопросы и ответы"
    private By seventhAnswer = By.xpath(".//div[@id='accordion__panel-6']/p");//локатор для ответа на седьмой вопрос
    private By eiqhtQuestion = By.id("accordion__heading-7");//локатор для восьмого вопроса в блоке "вопросы и ответы"
    private By eightAnswer = By.xpath(".//div[@id='accordion__panel-7']/p");//локатор для ответа на восьмой вопрос

    public PageMain(WebDriver driver) {
        this.driver = driver;
    }

    public void cookieAccept() {
        driver.findElement(acceptCookie).click();//метод, который принимает куки
    }

    public void scrollBottom() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");//метод, прокручивающий в самый низ главную страницу
    }

    public void firstQuestionSelect() {
        driver.findElement(firstQuestion).click();//метод нажимающий на первый вопрос в блоке "вопросы и ответы"
    }

    public String getTextFirstAnswer() {
        return
                driver.findElement(firstAnswer).getText();//метод возвращающий текст полученный в ответе на первый вопрос
    }

    public void secondQuestionSelect() {
        driver.findElement(secondQuestion).click();//метод нажимающий на второй вопрос в блоке "вопросы и ответы"
    }

    public String getTextSecondAnswer() {
        return
                driver.findElement(secondAnswer).getText();//метод возвращающий текст полученный в ответе на второй вопрос
    }

    public void thirdQuestionSelect() {
        driver.findElement(thirdQuestion).click();//метод нажимающий на третий вопрос в блоке "вопросы и ответы"
    }

    public String getTextThirdAnswer() {
        return
                driver.findElement(thirdAnswer).getText();//метод возвращающий текст полученный в ответе на третий вопрос
    }

    public void fourthQuestionSelect() {
        driver.findElement(fourthQuestion).click();//метод нажимающий на четвертый вопрос в блоке "вопросы и ответы"
    }

    public String getTextFourthAnswer() {
        return
                driver.findElement(fourthAnswer).getText();//метод возвращающий текст полученный в ответе на четвертый вопрос
    }

    public void fifthQuestionSelect() {
        driver.findElement(fifthQuestion).click();//метод нажимающий на пятый вопрос в блоке "вопросы и ответы"
    }

    public String getTextFifthAnswer() {
        return
                driver.findElement(fifthAnswer).getText();//метод возвращающий текст полученный в ответе на пятый вопрос
    }

    public void sixthQuestionSelect() {
        driver.findElement(sixthQuestion).click();//метод нажимающий на шестой вопрос в блоке "вопросы и ответы"
    }

    public String getTextSixthAnswer() {
        return
                driver.findElement(sixthAnswer).getText();//метод возвращающий текст полученный в ответе на шестой вопрос
    }

    public void seventhQuestionSelect() {
        driver.findElement(seventhQuesstion).click();//метод нажимающий на седьмой вопрос в блоке "вопросы и ответы"
    }

    public String getTextSeventhAnswer() {
        return
                driver.findElement(seventhAnswer).getText();//метод возвращающий текст полученный в ответе на седьмой вопрос
    }

    public void eightQuestionSelect() {
        driver.findElement(eiqhtQuestion).click();//метод нажимающий на восьмой вопрос в блоке "вопросы и ответы"
    }

    public String getTextEightAnswer() {
        return
                driver.findElement(eightAnswer).getText();//метод возвращающий текст полученный в ответе на восьмой вопрос
    }

    public void checkFirstQuestion() {
        scrollBottom();
        firstQuestionSelect();//метод , объединяющий скролл вниз до конца и выбирающий первый вопрос в блоке "вопросы и ответы"
    }

}
