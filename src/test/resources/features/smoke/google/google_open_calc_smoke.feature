@google
@enabled
Feature: Google page opens and searches

  In order to test google calculator
  As a browser user
  I want to run tests on UI

  Scenario: Google calc smoke
    Given I open 'http://google.com' page
    When In google page I search for 'google calc'
    Then Google calc page should be opened