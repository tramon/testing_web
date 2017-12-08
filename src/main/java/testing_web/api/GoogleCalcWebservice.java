package testing_web.api;


import com.jayway.restassured.response.Response;
import com.jayway.restassured.http.ContentType;

import static com.jayway.restassured.RestAssured.given;

public class GoogleCalcWebservice {

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
