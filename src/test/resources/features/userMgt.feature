Feature: UserMgt scenarios

  Background:
    When I click nav button "User-Mgt"

  @US4001
  Scenario: verify title of the page is "Register New User"
    Then Verify title of the page is "Register New User"

  @US4002
  Scenario: verify Login button is present
    Then Verify button "loginBtn" is displayed

  @US4003
  Scenario: verify Access DB button is present
    Then Verify button "accessDBBtn" is displayed

  @US4004
  Scenario: verify following input fields are displayed on the page
    Then Verify input Field "First Name" is displayed
    And Verify input Field "Last Name" is displayed
    And Verify input Field "Phone Number" is displayed
    And Verify input Field "E-mail" is displayed
    And Verify input Field "Role" is displayed

  @US4004b
  Scenario: verify following input fields are displayed on the page
    Then Verify following input fields are displayed:
      | First Name   |
      | Last Name    |
      | Phone Number |
      | E-mail       |
      | Role         |

  @US4010
  Scenario: Verify Submit button is enabled after filling up the form
    When Verify button "Submit" is disabled
    And I fill out new user form with following data:
      | First Name   | John             |
      | Last Name    | Snow             |
      | Phone Number | 123-456-7890     |
      | E-mail       | j.snow@north.com |
      | Role         | Student          |
    Then Verify button "Submit" is enabled

  @US1901
  Scenario Outline: Verify portal name based on who logs in to the system
    When I open login page
    And I log in with "<userName>" and "<password>"
    Then Verify "<role>" is displayed in destination page header

    Examples:
      | userName                      | password            | role       |
      | queen.rhaenyra@7kingdoms.rule | rhaenyra.targaryen$ | Instructor |
      | king.aegon@7kingdoms.rule     | aegon.targaryen$    | Student    |
      | prince.daemon@7kingdoms.rule  | daemon.targaryen$   | Mentor     |





