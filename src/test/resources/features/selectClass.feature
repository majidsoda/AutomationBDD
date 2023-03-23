@wip
Feature: SelectClass scenarios

  Background:
    When I click nav button "Select-class"

  @US6021
  Scenario:  Verify when I select numbers from the options it will display that number as “You selected:One” or “You selected:Two”
    And I select option "One" in section "Select single option 1"
    Then Verify displayed text is "You selected:One" under section "Select Single Option 1"

  @US6022
  Scenario: Verify when I select colors from the options it will display that color as
    And I select option "Yellow" in section "Select single option 2"
    Then Verify displayed text is "You selected:Yellow" under section "Select single option 2"