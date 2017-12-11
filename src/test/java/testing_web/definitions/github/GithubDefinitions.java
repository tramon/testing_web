package testing_web.definitions.github;


import cucumber.api.java.en.When;
import testing_web.steps.github.GithubActions;
import testing_web.steps.github.GithubStates;
import javax.inject.Inject;
import java.io.IOException;


public class GithubDefinitions {

    @Inject
    private GithubStates githubStates;

    @Inject
    private GithubActions githubActions;

    @When("^I get list of user repositories$")
    public void send_get_request_for_repositories_list() {
        githubActions.saveListOfReposToSystemProperty(githubStates.get_list_of_repositories());
    }

    @When("^I create public repository '([^\"]*)' on Github$")
    public void create_repository(String repositoryName) throws InterruptedException, IOException {
        githubActions.createRepositoryAndVerifyStatusCode(repositoryName);
    }

    @When("^I delete public repository '([^\"]*)' from Github$")
    public void delete_repository(String repositoryName) {
        githubActions.deleteRepositoryAndVerifyStatusCode(repositoryName);
    }


}
