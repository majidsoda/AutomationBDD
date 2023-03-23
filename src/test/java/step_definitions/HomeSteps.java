package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps {
    HomePage page;

    public HomeSteps() {
        page = new HomePage();
    }

    @Then("I should see header as {string}")
    public void i_should_see_header(String string) {

        BrowserUtils.assertEquals(page.headerTitle.getText(), string);
    }

    @When("I click link text {string}")
    public void iClickLinkText(String linkText) {
        switch(linkText){
            case "PHP Travels": BrowserUtils.click(page.pHPTravelsLink);
                break;
            case "Mercury tours": BrowserUtils.click(page.mercuryToursLink);
                break;
            case "Internet": BrowserUtils.click(page.internetLink);
                break;
            case "E-commerce": BrowserUtils.click(page.eCommerceLink);
                break;
            case "Passion Tea Company": BrowserUtils.click(page.passionTeaCompanyLink);
                break;
            case "Saucedemo" : BrowserUtils.click(page.saucedemoLink);
                break;
            case "Shopping Cart": BrowserUtils.click(page.shoppingCartLink);
                break;
            default:
                Assert.fail("Invalid Link");
        }
    }

    @Then("Verify destination window has url {string}")
    public void verifyDestinationWindowHasUrl(String URL) {
        BrowserUtils.switchToNewWindow();
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(), URL);
    }
}

