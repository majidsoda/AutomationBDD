package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class CalendarPage {
    public CalendarPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement endDateInput;

    @FindBy(xpath = "//div[contains(@class, 'day--today')]/following-sibling::div")
    public WebElement calendarTomorrowDate;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitCalendarBtn;

    @FindBy(id = "num-days")
    public WebElement resultText;

    @FindBy(xpath = "//div[@class='react-datepicker__input-container']/input")
    public WebElement startDateTxt;

    @FindBy(xpath = "(//div[@class='react-datepicker__input-container'])[2]/input")
    public WebElement endDateTxt;

    @FindBy(id = "num-days")
    public WebElement numberOfDaysTxt;


}
