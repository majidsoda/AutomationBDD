Feature: Others page scenario
  Background: Navigating to Others page
    When I click nav button "Others"

  @smoke @regression @US2001 @otherScenario
  Scenario: Verify Disabled button is disabled initially
    Then Verify Disabled button is disabled

  @US2002 @othersScenario
  Scenario: Verify Disabled buttons changed on click
    Then Verify Disabled button is disabled
    When I click on Toggle button
    Then Verify Disabled button is enabled
