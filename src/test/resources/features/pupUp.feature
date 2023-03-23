Feature: Pup-Up page scenarios
  Background: Navigating to Pop-Up page
    When I click nav button "Pop-Up"

  @US801 @PupUpScenario
  Scenario: Verify "New Message" header is displayed when user clicks on "Message" button
    And I click a button "Message"
    Then Verify header message is "New message"

  @US801 @PupUpScenario
  Scenario: Verify "BMI Calculator" header is displayed when user clicks on “BMI Calculator” button
    And I click a button "BMI Calculator"
    Then Verify header message is "BMI Calculator"
