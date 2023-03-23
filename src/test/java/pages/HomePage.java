package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class HomePage {
    public HomePage() { PageFactory.initElements(BrowserUtils.getDriver(), this);}

    @FindBy(id = "title")
    public WebElement headerTitle;

    @FindBy(xpath = "//a[text()='Calendar']")
    public WebElement navCalendarBtn;

    @FindBy(xpath ="//a[text()='Selectors']")
    public WebElement navSelectorsBtn;

    @FindBy(xpath ="//a[text()='Others']")
    public WebElement navOthersBtn;

    @FindBy(xpath ="//a[text()='User-Mgt']")
    public WebElement navUserMgtBtn;

    @FindBy(xpath ="//a[text()='Home']")
    public WebElement navHomeBtn;

    @FindBy(xpath ="//a[text()='Pop-Up']")
    public WebElement navPopUpBtn;

    @FindBy(xpath ="//a[text()='Tables']")
    public WebElement navTablesBtn;

    @FindBy(xpath ="//a[text()='Select-class']")
    public WebElement navSelectClassBtn;

    @FindBy(xpath ="//a[text()='Multiple-window']")
    public WebElement navMultipleWindowBtn;

    @FindBy(xpath ="//a[text()='Inputs']")
    public WebElement navInputsBtn;

    @FindBy(linkText = "Shopping Cart")
    public WebElement shoppingCartLink;

    @FindBy(linkText = "PHP Travels")
    public WebElement pHPTravelsLink;

    @FindBy(linkText = "Mercury tours")
    public WebElement mercuryToursLink;

    @FindBy(linkText = "Internet")
    public WebElement internetLink;

    @FindBy(linkText = "E-commerce")
    public WebElement eCommerceLink;

    @FindBy(linkText = "Passion Tea Company")
    public WebElement passionTeaCompanyLink;

    @FindBy(linkText = "Saucedemo")
    public WebElement saucedemoLink;

}
