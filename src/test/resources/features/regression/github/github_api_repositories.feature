@github
@enabled
@api
Feature: GitHub API verification

  In order to test GitHub API
  As an automation engineer
  I want to work with repositories

  Scenario: Get list of GitHub repositories for specified user
    When I get list of user repositories
    Then List of repositories is 'repo_1, repo_2'


  Scenario Outline: Authorize and create repository on GitHub
    When I create public repository '<repository>' on Github
    Then List of repositories is '<repository>, repo_1, repo_2'

    Examples:
      | repository     |
      | autoRepository |


  Scenario Outline: Authorize and delete repository on GitHub
    When I delete public repository '<repository>' from Github
    Then List of repositories is 'repo_1, repo_2'

    Examples:
      | repository     |
      | autoRepository |