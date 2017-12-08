@complete
Feature: Example feature

  In order to test google calculator
  As a browser user
  I want to run tests on UI

  Scenario: Searching Google...
    Given I open 'http://google.com' page
    When In google page I search for 'google calc'
    Then I should have google calc page opened