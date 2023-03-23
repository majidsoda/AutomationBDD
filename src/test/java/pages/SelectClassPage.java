package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class SelectClassPage {
    public SelectClassPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);

    }

    @FindBy(name = "select1")
    public WebElement select1Section;

    @FindBy(name = "select2")
    public WebElement select2Section;

    @FindBy(css = "#select1-selected-value>span")
    public WebElement select1Res;

    @FindBy(css = "#select2-selected-value>span")
    public WebElement select2Res;

}
