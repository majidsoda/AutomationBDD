package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class PopUpPage {
    public PopUpPage() { PageFactory.initElements(BrowserUtils.getDriver(), this);}

    @FindBy(id = "exampleModalLabel")
    public WebElement headerMsg;

    @FindBy(xpath = "//button[text()='Message']")
    public WebElement messageBtn;

    @FindBy(id = "bmi_btn")
    public WebElement bmIBtn;

    @FindBy(id = "staticBackdropLabel")
    public WebElement bmIHeaderMsg;
}
