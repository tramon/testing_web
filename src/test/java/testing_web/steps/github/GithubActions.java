package testing_web.steps.github;

import com.jayway.restassured.response.Response;

import java.util.Collections;
import java.util.List;

import static com.jayway.restassured.RestAssured.given;
import static testing_web.commons.constants.Constants.*;
import static testing_web.commons.constants.Constants.GITHUB_LOGIN;
import static testing_web.commons.constants.Constants.GITHUB_PASSWORD;
import static testing_web.commons.constants.SystemProperties.GITHUB_LIST_OF_REPOSITORIES;

public class GithubActions {


    public void createRepositoryAndVerifyStatusCode(String repositoryName) {
        String jsonString = String.format("{\n" +
                "  \"name\": \"%s\",\n" +
                "  \"description\": \"This is your first repository\",\n" +
                "  \"homepage\": \"https://github.com\",\n" +
                "  \"private\": false,\n" +
                "  \"has_issues\": false,\n" +
                "  \"has_projects\": false,\n" +
                "  \"has_wiki\": false\n" +
                "}", repositoryName);

        given()
                .auth()
                .preemptive()
                .basic(GITHUB_LOGIN, GITHUB_PASSWORD)
                .body(jsonString)
                .when()
                .post(GITHUB_API_HOST + GITHUB_CREATE_REPO_ENDPOINT)
                .then()
                .statusCode(201)
                .extract()
                .response();

    }

    public void deleteRepositoryAndVerifyStatusCode(String repositoryName) {
        String endpointToDeleteRepo = String.format(GITHUB_API_HOST + GITHUB_DELETE_REPO_ENDPOINT, GITHUB_LOGIN, repositoryName);
        given()
                .auth()
                .preemptive()
                .basic(GITHUB_LOGIN, GITHUB_PASSWORD)
                .when()
                .delete(endpointToDeleteRepo)
                .then()
                .statusCode(204)
                .extract()
                .response();
    }

    public void saveListOfReposToSystemProperty(List<String> listOfActualRepositories) {
        Collections.sort(listOfActualRepositories);
        String stringFromList = String.join(", ", listOfActualRepositories);
        System.setProperty(GITHUB_LIST_OF_REPOSITORIES, stringFromList);

    }
}
