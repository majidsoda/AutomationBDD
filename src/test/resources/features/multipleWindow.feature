Feature: MultipleWindow scenarios

  Background:
    When I click nav button "Multiple-window"

  @US9001
  Scenario: verify following buttons are enabled
    Then Verify button "Launch TLA" is enabled
    And Verify button "Launch Google" is enabled
    And Verify button "Launch Facebook" is enabled

  @US9001b
  Scenario: verify following buttons are enabled:
    Then verify following buttons are enabled:
      | Launch TLA      |
      | Launch Google   |
      | Launch Facebook |

  @US9001c
  Scenario Outline: verify following buttons are enabled with Scenario Outline
    Then Verify button "<button name>" is enabled
    Examples:
      | button name     |
      | Launch TLA      |
      | Launch Google   |
      | Launch Facebook |

