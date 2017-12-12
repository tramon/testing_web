package testing_web.steps.github;


import testing_web.commons.constants.SystemVariables;
import testing_web.commons.dao.github.CreateRepoJsonDao;
import java.util.Collections;
import java.util.List;

import static com.jayway.restassured.RestAssured.given;
import static testing_web.commons.constants.Constants.*;
import static testing_web.commons.constants.Constants.GITHUB_LOGIN;
import static testing_web.commons.constants.Constants.GITHUB_PASSWORD;


public class GithubActions {


    public void createRepositoryAndVerifyStatusCode(String repositoryName) {

        String json = new CreateRepoJsonDao(repositoryName).toString();

                given()
                .auth()
                .preemptive()
                .basic(GITHUB_LOGIN, GITHUB_PASSWORD)
                .body(json)
                .when()
                .post(GITHUB_API_HOST + GITHUB_CREATE_REPO_ENDPOINT)
                .then()
                .statusCode(201);

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
                .statusCode(204);

    }

    public void saveListOfReposToSystemProperty(List<String> listOfActualRepositories) {
        Collections.sort(listOfActualRepositories);
        String stringFromList = String.join(", ", listOfActualRepositories);
        System.setProperty(SystemVariables.GITHUB_LIST_OF_REPOSITORIES, stringFromList);

    }
}
