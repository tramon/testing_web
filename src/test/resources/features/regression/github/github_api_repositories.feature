@github
@enabled
@api
Feature: GitHub API verification

  In order to test GitHub API
  As an automation engineer
  I want to work with repositories

  Scenario: Get list of GitHub repositories for specified user
    Given I send get request to learn details about 'tramontest' user repositories