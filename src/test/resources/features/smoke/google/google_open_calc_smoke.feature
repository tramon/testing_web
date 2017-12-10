@google
@enabled
@ui
Feature: Google page opens and searches for specified query

  In order to test google calculator
  As a browser user
  I want to run tests on UI

  Scenario: Google calc smoke
    Given I open 'http://google.com' page
    When In google page I search for 'google calc'
    Then Google calc page should be opened