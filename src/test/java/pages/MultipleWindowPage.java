package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class MultipleWindowPage {

    public MultipleWindowPage(){

        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }


    @FindBy(xpath = "//a[text()='Launch TLA']")
    public WebElement launchTLABtn;

    @FindBy(xpath = "//a[text()='Launch TLA']")
    public WebElement launchGoogleBtn;

    @FindBy(xpath = "//a[text()='Launch Facebook']")
    public WebElement launchFacebookBtn;

}
