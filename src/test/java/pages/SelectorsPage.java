package pages;

import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class SelectorsPage {
    public SelectorsPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
}
