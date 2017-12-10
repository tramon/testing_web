package testing_web.definitions.github;

import cucumber.api.java.en.Given;
import testing_web.steps.github.GithubStates;

import javax.inject.Inject;

public class GithubDefinitions {

    @Inject
    private GithubStates githubStates;


    @Given("^I send get request to learn details about '([^\"]*)' user repositories$")
    public void send_get_request_for_repositories_list(String username){
        githubStates.sendGetForListOfRepositories(username);
        githubStates.sendGetToAuthorize(username);
    }


}
