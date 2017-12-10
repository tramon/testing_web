package testing_web.steps.github;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;

public class GithubActions {


    public Response sendPostMock(String fileName) {

        return given()
                .contentType(ContentType.XML)
                .body("body of post")
                .when()
                .post("endpoint")
                .then()
                .statusCode(200)
                .extract()
                .response();
    }

}
