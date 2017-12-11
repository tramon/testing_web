package testing_web.steps.github;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import org.openqa.selenium.WebDriver;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

import static com.jayway.restassured.RestAssured.given;
import static testing_web.commons.constants.Constants.*;

public class GithubStates {


    public List<String> get_list_of_repositories(String endpoint) {
        String reposEndPoint = String.format(GITHUB_LIST_OF_USER_REPOS, endpoint);

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
