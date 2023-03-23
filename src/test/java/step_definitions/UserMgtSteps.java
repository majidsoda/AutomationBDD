package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.UserMgtPage;
import utils.BrowserUtils;

import java.util.List;
import java.util.Map;

public class UserMgtSteps {
    UserMgtPage page;
    HomePage homePage;

    public UserMgtSteps() {
        page = new UserMgtPage();
        homePage = new HomePage();
    }

    @Then("Verify title of the page is {string}")
    public void verifyTitleOfThePageIs(String title) {
        BrowserUtils.assertEquals(page.pageTitle.getText(), title);
        System.out.println("The title of the page is " + title);
    }

    @Then("Verify button {string} is displayed")
    public void verifyButtonIsDisplayed(String button) {
        switch (button) {
            case "loginBtn":
                BrowserUtils.isDisplayed(page.loginBtn);
                break;
            case "accessDBBtn":
                BrowserUtils.isDisplayed(page.accessDBBtn);
                break;
            case "Home":
                BrowserUtils.isDisplayed(homePage.navHomeBtn);
                break;
            case "Calendar":
                BrowserUtils.isDisplayed(homePage.navCalendarBtn);
                break;
            case "User-Mgt":
                BrowserUtils.isDisplayed(homePage.navUserMgtBtn);
                break;
            case "Others":
                BrowserUtils.isDisplayed(homePage.navOthersBtn);
                break;
            case "Tables":
                BrowserUtils.isDisplayed(homePage.navTablesBtn);
                break;
            default:
                throw new IllegalArgumentException("The button is not valid");
        }
        System.out.println(button + " is successfully displayed");

    }

    @Then("Verify input Field {string} is displayed")
    public void verify_input_field_is_displayed(String inputField) {
        switch (inputField.toLowerCase()) {
            case "first name":
                BrowserUtils.isDisplayed(page.firstName);
                break;
            case "last name":
                BrowserUtils.isDisplayed(page.lastName);
                break;
            case "phone number":
                BrowserUtils.isDisplayed(page.phoneNumber);
                break;
            case "e-mail":
                BrowserUtils.isDisplayed(page.email);
                break;
            case "role":
                BrowserUtils.isDisplayed(page.roleSelect);
                break;
            default:
                Assert.fail();
        }
    }

    @Then("Verify following input fields are displayed:")
    public void verify_following_input_fields_are_displayed(List<String> inputField) {
        for (String each : inputField) {
            switch (each.toLowerCase()) {
                case "first name":
                    BrowserUtils.isDisplayed(page.firstName);
                    break;
                case "last name":
                    BrowserUtils.isDisplayed(page.lastName);
                    break;
                case "phone number":
                    BrowserUtils.isDisplayed(page.phoneNumber);
                    break;
                case "e-mail":
                    BrowserUtils.isDisplayed(page.email);
                    break;
                case "role":
                    BrowserUtils.isDisplayed(page.roleSelect);
                    break;
                default:
                    Assert.fail("Invalid input Field");
            }
        }
    }

    @Then("Verify button {string} is disabled")
    public void verifyButtonIsDisabled(String button) {
        switch (button.toLowerCase()) {
            case "submit":
                BrowserUtils.isDisabled(page.userMgtSubmitBtn);
                break;
            default:
                Assert.fail();
        }
    }

    @When("I fill out new user form with following data:")
    public void i_fill_out_new_user_form_with_following_data(Map<String, String> map) {
        for (String key : map.keySet()) {
            switch (key.toLowerCase()) {
                case "first name":
                    page.firstName.sendKeys(map.get(key));
                    break;
                case "last name":
                    page.lastName.sendKeys(map.get(key));
                    break;
                case "phone number":
                    page.phoneNumber.sendKeys(map.get(key));
                    break;
                case "e-mail":
                    page.email.sendKeys(map.get(key));
                    break;
                case "role":
                    page.roleSelect.sendKeys(map.get(key));
                    break;
                default:
                    Assert.fail("Invalid input Field");
            }
        }
    }

    @When("I open login page")
    public void iOpenPage() {
        BrowserUtils.click(page.loginPageBtn);
        BrowserUtils.switchToNewWindow();
    }
    @And("I log in with {string} and {string}")
    public void iLogInWithAnd(String userName, String password) {

        page.usernameInput.sendKeys(userName);
        page.passwordInput.sendKeys(password);
        BrowserUtils.click(page.loginBtn);
    }

    @Then("Verify {string} is displayed in destination page header")
    public void verifyIsDisplayedInDestinationPageHeader(String role) {
        BrowserUtils.switchToNewWindow();
        BrowserUtils.assertEquals(page.portalName.getText(), role);
    }
}
