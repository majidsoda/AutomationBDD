package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OthersPage;
import utils.BrowserUtils;

public class OthersSteps {

    OthersPage page;

    public OthersSteps() {
        page = new OthersPage();
    }

    @When("I open Others page")
    public void i_open_others_page() {
        System.out.println("opened others page");
    }

    @Then("Verify Disabled button is disabled")
    public void verify_disabled_button_is_disabled() {
        String disableText = "DISABLED BUTTON";
        BrowserUtils.assertEquals(page.statusBtn.getText(), disableText);
        BrowserUtils.isDisabled(page.statusBtn);

    }

    @When("I click on Toggle button")
    public void iClickOnToggleButton() {
        BrowserUtils.click(page.toggleBtn);

    }
    @Then("Verify Disabled button is enabled")
    public void verifyDisabledButtonIsEnabled() {
        String enableText = "ENABLED BUTTON";
        BrowserUtils.assertEquals(page.statusBtn.getText(), enableText);
        BrowserUtils.isEnabled(page.statusBtn);

    }
}
