package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.SelectorsPage;

public class SelectorsSteps {
    SelectorsPage page;
    public SelectorsSteps(){
        page = new SelectorsPage();
    }

    @And("I click {string} in Car section")
    public void iClickInCarSection(String color) {
        System.out.println("Click on red btn in car section");
        System.out.println("Click on blue btn in car section");
        System.out.println("Click on yellow btn in car section");
    }

    @Then("Verify displayed text in Car section should be Red")
    public void verify_displayed_text_in_car_section_should_be_red() {
        System.out.println("Verify displayed text is red");
    }

    @Then("Verify displayed text in Car section should be Blue")
    public void verify_displayed_text_in_car_section_should_be_blue() {
        System.out.println("Verify displayed text is blue");
    }
    @Then("Verify displayed text in Car section should be Yellow")
    public void verify_displayed_text_in_car_section_should_be_yellow() {
        System.out.println("Verify displayed text is yellow");

    }

}
