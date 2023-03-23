package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MultipleWindowPage;
import pages.UserMgtPage;
import utils.BrowserUtils;

import java.util.List;

public class MultipleWindowSteps {

    MultipleWindowPage page;
    UserMgtPage userMgtPage;
    public MultipleWindowSteps() {
        page = new MultipleWindowPage();
        userMgtPage = new UserMgtPage();

    }

    @Then("Verify button {string} is enabled")
    public void verifyButtonIsEnabled(String buttonEnabled) {
        switch (buttonEnabled.toLowerCase()){
            case "launch tla":
                BrowserUtils.isEnabled(page.launchTLABtn);
                break;
            case "launch google":
                BrowserUtils.isEnabled(page.launchGoogleBtn);
                break;
            case "launch facebook":
                BrowserUtils.isEnabled(page.launchFacebookBtn);
                break;
            case "submit":
                BrowserUtils.isEnabled(userMgtPage.userMgtSubmitBtn);
                break;
            default:
                Assert.fail();
        }
    }
    @Then("verify following buttons are enabled:")
    public void verify_following_buttons_are_enabled( List<String> enabledBtn) {
        for (String each : enabledBtn) {
            switch (each.toLowerCase()) {
                case "launch tla":
                    BrowserUtils.isEnabled(page.launchTLABtn);
                    break;
                case "launch google":
                    BrowserUtils.isEnabled(page.launchGoogleBtn);
                    break;
                case "launch facebook":
                    BrowserUtils.isEnabled(page.launchFacebookBtn);
                    break;
                default:
                    Assert.fail();
            }

        }
    }
}
