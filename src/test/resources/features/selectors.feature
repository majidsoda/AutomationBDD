Feature: Selectors page scenario

  @US501
  Scenario: Verify user clicks on a color and sees color matched
    When I click nav button "Selectors"
    And I click "Red" in Car section
    Then Verify displayed text in Car section should be Red
    When I click "Blue" in Car section
    Then Verify displayed text in Car section should be Blue
    When I click "Yellow" in Car section
    Then Verify displayed text in Car section should be Yellow
