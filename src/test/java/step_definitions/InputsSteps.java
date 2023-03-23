package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.InputsPage;
import utils.BrowserUtils;

import java.util.Map;

public class InputsSteps {
    InputsPage page;
    public InputsSteps() {
        page = new InputsPage();
    }

    @When("I fill out new input form with following data:")
    public void i_fill_out_new_input_form_with_following_data(Map<String, String> inputForm) {
        for (String key : inputForm.keySet()) {
                BrowserUtils.sendKeys(
                        BrowserUtils.getDriver().findElement(By.name(key)), inputForm.get(key));
            }
        }

    @Then("Verify text message is {string}")
    public void verify_text_message_is(String message) {
        BrowserUtils.assertEquals(page.txtMsg.getText(), message);
    }
}
