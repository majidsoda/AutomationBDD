@HomeScenarios
Feature: HomePage scenarios

  @US1021
  Scenario:Test Header
    #Given I navigate to homepage
    Then I should see header as "Automation with Selenium"

  @US1022
  Scenario: Verify nav buttons are displayed
    Then Verify button "Home" is displayed
    Then Verify button "Calendar" is displayed
    Then Verify button "User-Mgt" is displayed
    Then Verify button "Others" is displayed
    Then Verify button "Tables" is displayed

  @US1022b
  Scenario Outline: Test nav buttons are displayed with Scenario Outline
    Then Verify button "<button name>" is displayed
    Examples:
      | button name |
      | Home        |
      | Calendar    |
      | User-Mgt    |
      | Others      |
      | Tables      |

  @US1023
  Scenario Outline: verify practice website destination url with Scenario Outline
    When I click link text "<linkText>"
    Then Verify destination window has url "<URL>"
    Examples:
      | linkText            | URL                                                     |
      | PHP Travels         | https://phptravels.com/demo/                            |
      | Mercury tours       | http://newtours.demoaut.com/                           |
      | Internet            | http://the-internet.herokuapp.com/                      |
      | E-commerce          | http://automationpractice.com/cgi-sys/suspendedpage.cgi |
      | Passion Tea Company | http://www.practiceselenium.com/                        |
      | Saucedemo           | https://www.saucedemo.com/                              |
      | Shopping Cart       | https://react-shopping-cart-67954.firebaseapp.com/      |



