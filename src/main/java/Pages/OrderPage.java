package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPage {
    private WebDriver driver;
    public String name = "Дмитрий";//значение имени в поле "имя"
    public String surname = "Казаков";//значение фамилия в поле "фамилия"
    public String adress = "Москва льва толстого 35";//значение адреса в поле адреса
    public String number = "+79028447532";//значение номера в поле номера
    public String comment = "привезите пожалуйста самокат";//значение комментария в поле комментарий
    private By acceptCookie = By.id("rcc-confirm-button");//локатор для кнопки "принять куки"
    private By orderButton = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");//локатор для кнопки "оформить заказ на главной странице
    private By fieldName = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Имя']");//локатор для поля "имя" на первой странице оформления заказа
    private By fieldSurname = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Фамилия']");//локатор для поля "фамилия" на первой странице оформления заказа
    private By fieldAdress = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Адрес: куда привезти заказ']");//локатор для поля "адрес" на первой странице оформления заказа
    private By fieldStation = By.xpath(".//div[@class='select-search']/div[@class='select-search__value']/input[@placeholder='* Станция метро']");//локатор для списка "станция метро" на первой странице оформления заказа
    private By fieldNumber = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Телефон: на него позвонит курьер']");//локатор для поля "телефон" на первой странице оформления заказа
    private final By nextButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");//локатор для кнопки следующая страница на первой странице оформления заказа
    private By fieldCalendar = By.xpath(".//div[@class='react-datepicker__input-container']/input[@placeholder='* Когда привезти самокат']");//локатор для выпадающего календаря на первой странице оформления заказа
    private By selectThirdNovember = By.xpath(".//div[@class='react-datepicker__day react-datepicker__day--030 react-datepicker__day--selected']");//локатор для выбора на выпадающем календаре определенного дня
    private By closeRentalButton = By.xpath(".//div[@class='Dropdown-control']");//локатор для окна "срок аренды" - чтобы он раскрылся
    private By fieldRentalPeriod = By.xpath(".//div[@class='Dropdown-menu']/child::node()[last()]");//локатор для выбора последнего значения из списка "срок аренды"
    private By blackColour = By.xpath(".//label[@class='Checkbox_Label__3wxSf']/input[@id='black']");//локатор для выбора чекбокса "черный жемчуг"
    private By fieldComment = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='Комментарий для курьера']");//локатор для поля "комментарий"
    private By finalOrder = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");//локатор для кнопки "заказать" на последней странице оформления заказа
    private By acceptOrder = By.xpath(".//div[@class='Order_Modal__YZ-d3']/div[@class='Order_Buttons__1xGrp']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");//локатор для кнопки "да" на странице подтверждения офорлмения заказа

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void cookieAccept() {
        driver.findElement(acceptCookie).click();//метод, который принимает куки
    }

    public void clickOrder() {
        driver.findElement(orderButton).click();//метод, который нажимает на кнопку "заказать" на главной странице
    }

    public void fillingName() {
        driver.findElement(fieldName).sendKeys(name);//метод , заполняющий поле имя - определенный значением
    }

    public void fillingSurname() {
        driver.findElement(fieldSurname).sendKeys(surname);//метод , заполняющий поле фамилия - определенный значением
    }

    public void fillingAdress() {
        driver.findElement(fieldAdress).sendKeys(adress);//метод , заполняющий поле адрес - определенный значением
    }

    public void fillingStation() {
        driver.findElement(fieldStation).sendKeys("Бунинская аллея");
        driver.findElement(By.xpath("//div[@class='select-search__select']")).click();//метод, заполняющий поле станция метро и выбирает единственный полученый результат
    }

    public void fillingNumber() {
        driver.findElement(fieldNumber).sendKeys(number);//метод , заполняющий поле номер - определенный значением
    }

    public void clickNextPage() {
        driver.findElement(nextButton).click();
        new WebDriverWait(driver, 60);//метод, который нажимает на кнопку следующей страницы оформления заказа и ожидает 60 секунд до появления следюущей страницы
    }

    public void selectCalendarDay() {
        driver.findElement(fieldCalendar).sendKeys("30.11.2022");
        driver.findElement(selectThirdNovember).click();//метод который вводит определенную дату в поле календарь и кликает на нужный элемент на выпадающем календаре
    }

    public void selectRentTime() {
        driver.findElement(closeRentalButton).click();
        driver.findElement(fieldRentalPeriod).click();//метод который кликает на поле "срок аренды" и выбирает последнее значение из выпадающего списка
    }

    public void selectColour() {
        driver.findElement(blackColour).click();//метод который выбирает цвет самоката "черный жемчуг"
    }

    public void writeComment() {
        driver.findElement(fieldComment).sendKeys(comment);//метод , заполняющий поле комментарий - определенный значением
    }

    public void makeOrder() {
        driver.findElement(finalOrder).click();
        new WebDriverWait(driver, 60);
        driver.findElement(acceptOrder).click();//метод, нажимающий на кнопку заказать на второй странице оформления заказа , после чего ожидает появления следующего элемента, и нажимающий на на кнопку "да" в окне подтверждения заказа
    }

    public void firstPageOrder() {
        fillingName();
        fillingSurname();
        fillingAdress();
        fillingStation();
        fillingNumber();//метод, объединяющий методы для ввода имени, фамилии, адреса, станции метро, номера
    }

    public void secondPageOrder() {
        selectCalendarDay();
        selectRentTime();
        selectColour();
        writeComment();//метод объединяющий методы для ввода даты , срока аренды , выбора цвета, написания комментария
    }
}
