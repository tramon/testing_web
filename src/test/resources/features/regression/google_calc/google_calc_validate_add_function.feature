@google
@enabled
Feature: Example feature

  In order to test google calculator
  As a browser user
  I want to add numbers in google calc

  Scenario: Google calc add - TC.01
    Given I open 'http://google.com' page
    When In google page I search for 'google calc'
    Then Google calc page should be opened
    When I enter '2' to google calc input
    And I enter '+' to google calc input
    And I enter '2' to google calc input
    And I enter '=' to google calc input
    Then Check that google calc input is '4'


  Scenario: Google calc add - TC.02
    Given I open 'http://google.com' page
    When In google page I search for 'google calc'
    Then Google calc page should be opened
    When I enter '4' to google calc input
    And I enter '+' to google calc input
    And I enter '4' to google calc input
    And I enter '=' to google calc input
    Then Check that google calc input is '8'