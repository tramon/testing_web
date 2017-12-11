package testing_web.definitions.github;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import testing_web.steps.github.GithubActions;
import testing_web.steps.github.GithubStates;

import javax.inject.Inject;

import java.util.Collections;
import java.util.List;

import static testing_web.commons.constants.SystemProperties.GITHUB_LIST_OF_REPOSITORIES;

public class GithubDefinitions {

    @Inject
    private GithubStates githubStates;

    @Inject
    private GithubActions githubActions;

    @When("^I get list of '([^\"]*)' user repositories$")
    public void send_get_request_for_repositories_list(String username) {
        githubActions.saveListOfReposToSystemProperty(githubStates.get_list_of_repositories(username));
    }

    @When("^I create public repository '([^\"]*)' on Github$")
    public void create_repository(String repositoryName) throws InterruptedException {
        githubActions.createRepositoryAndVerifyStatusCode(repositoryName);
    }

    @When("^I delete public repository '([^\"]*)' from Github$")
    public void delete_repository(String repositoryName) {
        githubActions.deleteRepositoryAndVerifyStatusCode(repositoryName);
    }


}
