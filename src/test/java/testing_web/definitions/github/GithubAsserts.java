package testing_web.definitions.github;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import testing_web.steps.github.GithubStates;
import javax.inject.Inject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static testing_web.commons.constants.Constants.GITHUB_LOGIN;
import static testing_web.commons.constants.SystemProperties.GITHUB_LIST_OF_REPOSITORIES;


public class GithubAsserts {

    @Inject
    private GithubStates githubStates;


    @Then("^List of repositories is '([^\"]*)'$")
    public void get_list_of_repositories(List<String> expectedList) {
        Collections.sort(expectedList);

        List<String> actualList = githubStates.get_list_of_repositories(GITHUB_LOGIN);
        Collections.sort(actualList);

        System.out.println("Expected list of repositories: \t" + expectedList);
        System.out.println("Actual list of repositories: \t" + actualList);

        Assert.assertTrue("Expected repositories differ from actual",
                expectedList.equals(actualList));

    }


}
