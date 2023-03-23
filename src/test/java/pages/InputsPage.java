package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class InputsPage {

    public InputsPage(){

        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy(name = "first_name")
    public WebElement firstNameInput;

    @FindBy(name = "last_name")
    public WebElement lastNameInput;

    @FindBy(name = "email")
    public WebElement emailInput;

    @FindBy(name = "phone")
    public WebElement phoneInput;

    @FindBy(name = "address")
    public WebElement addressInput;

    @FindBy(name = "city")
    public WebElement cityInput;

    @FindBy(name = "state")
    public WebElement stateInput;

    @FindBy(name = "zip")
    public WebElement zipInput;

    @FindBy(name = "button3")
    public WebElement sendBtn;

    @FindBy(name = "answer3")
    public WebElement txtMsg;

}
