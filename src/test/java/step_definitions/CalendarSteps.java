package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;
import utils.BrowserUtils;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalendarSteps {
    CalendarPage page;
    HomePage homePage;
    PopUpPage popUpPage;
    InputsPage inputsPage;

    public CalendarSteps() {
        this.page = new CalendarPage();
        homePage = new HomePage();
        popUpPage = new PopUpPage();
        inputsPage = new InputsPage();
    }

    @When("I click nav button {string}")
    public void i_click_nav_button(String navBtn) {
        switch (navBtn.toLowerCase()) {
            case "calendar":
                BrowserUtils.click(homePage.navCalendarBtn);
                break;
            case "selectors":
                BrowserUtils.click(homePage.navSelectorsBtn);
                break;
            case "others":
                BrowserUtils.click(homePage.navOthersBtn);
                break;
            case "user-mgt":
                BrowserUtils.click(homePage.navUserMgtBtn);
                break;
            case "pop-up":
                BrowserUtils.click(homePage.navPopUpBtn);
                break;
            case "select-class":
                BrowserUtils.click(homePage.navSelectClassBtn);
                break;
            case "multiple-window":
                BrowserUtils.click(homePage.navMultipleWindowBtn);
                break;
            case "inputs":
                BrowserUtils.click(homePage.navInputsBtn);
                break;
            default:
                Assert.fail();

        }System.out.println("I clicked on "+navBtn+" successfully");
    }

    @When("I click a button {string}")
    public void i_click_a_button(String calendarBtn) {
        switch (calendarBtn) {
            case "endDateInput":
                BrowserUtils.click(page.endDateInput);
                break;
            case "calendarTomorrowDate":
                BrowserUtils.click(page.calendarTomorrowDate);
                break;
            case "submitCalendarButton":
                BrowserUtils.click(page.submitCalendarBtn);
                break;
            case "Message":
                BrowserUtils.click(popUpPage.messageBtn);
                break;
            case "BMI Calculator":
                BrowserUtils.click(popUpPage.bmIBtn);
                break;
            case "Send":
                BrowserUtils.click(inputsPage.sendBtn);
                break;
            default:
                Assert.fail();
        }

    }

    @Then("Verify text will display {int} day difference")
    public void verify_text_will_display_day_difference(Integer int1) {

        String startDate = page.startDateTxt.getAttribute("value");
        String endDate = page.endDateTxt.getAttribute("value");

        if (startDate.charAt(0) == '0')
            startDate = startDate.substring(1);
        if (endDate.charAt(0) == '0')
            endDate = endDate.substring(1);

        String expectedTxt = "There are 1 days between " + startDate + " and " + endDate + "";
        String actualTxt = BrowserUtils.getText(page.numberOfDaysTxt);

        BrowserUtils.assertEquals(actualTxt, expectedTxt);
        BrowserUtils.quitDriver();
    }

    @Then("Verify text contains current date")
    public void verifyTextWillContainsCurrentDate() {

        System.out.println("Verify text contains current date");
    }

    @When("I capture today's date")
    public void iCaptureTodaySDate() {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("M/dd/YYYY");
        String tomStr = f.format(tomorrow);
        String todayStr = f.format(today);

        BrowserUtils.sendKeys(page.endDateInput, tomStr);
        BrowserUtils.sleep(3000);
    }
}
