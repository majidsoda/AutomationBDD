package step_definitions;

import io.cucumber.java.en.Then;
import pages.PopUpPage;
import utils.BrowserUtils;

public class PopUpSteps {

    PopUpPage page;
    public PopUpSteps() { page = new PopUpPage();   }

    @Then("Verify header message is {string}")
    public void verifyHeaderMessageIs(String expectedTxt) {

        switch (expectedTxt){

            case "Message":
                BrowserUtils.assertEquals(BrowserUtils.getText(page.headerMsg), expectedTxt);
                break;
            case "BMI Calculator":
                BrowserUtils.assertEquals(BrowserUtils.getText(page.bmIHeaderMsg), expectedTxt);
                break;
        }
    }
}
