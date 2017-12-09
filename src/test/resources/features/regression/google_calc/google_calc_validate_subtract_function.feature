@google
@enabled
Feature: Example feature

  In order to test google calculator
  As a browser user
  I want to subtract numbers in google calc

  Scenario: Google calc subtract - TC.01
    Given I open 'http://google.com' page
    When In google page I search for 'google calc'
    Then Google calc page should be opened
    When I enter '3' to google calc input
    And I enter '−' to google calc input
    And I enter '2' to google calc input
    And I enter '=' to google calc input
    Then Check that google calc input is '1'

  Scenario: Google calc subtract - TC.02
    Given I open 'http://google.com' page
    When In google page I search for 'google calc'
    Then Google calc page should be opened
    When I enter '9' to google calc input
    And I enter '−' to google calc input
    And I enter '5' to google calc input
    And I enter '=' to google calc input
    Then Check that google calc input is '4'