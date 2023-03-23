package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.SelectClassPage;
import utils.BrowserUtils;

public class SelectClassSteps {
    SelectClassPage page;
    public SelectClassSteps() {
        page = new SelectClassPage();
    }
    @When("I select option {string} in section {string}")
    public void i_select_option_in_section(String optionValue, String sectionName) {
        Select select;
        switch (sectionName.toLowerCase().trim()) {
            case "select single option 1":
                select = new Select(page.select1Section);
                select.selectByValue(optionValue);

                break;
            case "select single option 2":
                select = new Select(page.select2Section);
                select.selectByValue(optionValue);

                break;
            default:
                Assert.fail();
        }
    }
    @Then("Verify displayed text is {string} under section {string}")
    public void verify_displayed_text_is_under_section(String expectedValue, String sectionName) {
        String actualValue = "";
        switch (sectionName.toLowerCase().trim()) {
            case "select single option 1":
                actualValue = "You selected:"+BrowserUtils.getText(page.select1Res);
                break;
            case "select single option 2":
                actualValue ="You selected:"+BrowserUtils.getText(page.select2Res);
                break;
            default:
                Assert.fail();
        }
        BrowserUtils.assertEquals(actualValue,expectedValue);
    }
}
