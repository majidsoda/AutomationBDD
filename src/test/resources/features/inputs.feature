@Inputs
Feature: UserMgt scenarios

  Background:
    When I click nav button "inputs"

  @US4051
  Scenario: Contact Us form text
    When I fill out new input form with following data:
      | first_name | John                     |
      | last_name  | Wick                     |
      | email      | john.wick@contractor.com |
      | phone      | 666-666-6666             |
      | address    | 123 Main St              |
      | city       | NYC                      |
      | state      | New York                 |
      | zip        | 12345                    |
    And I click a button "Send"
    Then Verify text message is "Thanks for contacting us, we will get back to you shortly."