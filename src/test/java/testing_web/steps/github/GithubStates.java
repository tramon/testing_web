package testing_web.steps.github;


import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import testing_web.commons.constants.Constants;
import java.util.ArrayList;
import java.util.List;

import static com.jayway.restassured.RestAssured.given;


public class GithubStates {

    public List<String> get_list_of_repositories() {
        String reposEndPoint = String.format(Constants.GITHUB_LIST_OF_USER_REPOS, Constants.GITHUB_LOGIN);

        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(reposEndPoint)
                .then()
                .statusCode(200)
                .extract()
                .response();

        return new ArrayList<>(getAllReposList(response));
    }

    private List<String> getAllReposList(Response response) {
        final String REPOSITORY_NAME = "name";
        return response.getBody().jsonPath().get(REPOSITORY_NAME);
    }

}
