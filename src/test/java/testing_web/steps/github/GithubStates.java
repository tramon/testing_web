package testing_web.steps.github;

import com.google.gson.JsonObject;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import java.util.List;

import static com.jayway.restassured.RestAssured.given;

public class GithubStates {


    public Response sendGetForListOfRepositories(String endpoint) {
        String reposEndPoint = String.format("https://api.github.com/users/%s/repos", endpoint);


        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(reposEndPoint)
                .then()
                .statusCode(200)
                .extract()
                .response();

        getAllReposList(response).forEach(System.out::println);

        return response;
    }



    public Response sendGetToAuthorize(String endpoint) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Hello-World");
        jsonObject.addProperty("description", "Hello-World repo");
        jsonObject.addProperty("homepage", "https://github.com");
        jsonObject.addProperty("private", "false");
        jsonObject.addProperty("has_issues", "false");
        jsonObject.addProperty("has_projects", "false");
        jsonObject.addProperty("has_wiki", "false");

        Response response = given()
                .auth()
                .preemptive()
                .basic("tramontest", "password-1")
//                .body(jsonObject)
                .body("{\n" +
                        "  \"name\": \"Hello-World\",\n" +
                        "  \"description\": \"This is your first repository\",\n" +
                        "  \"homepage\": \"https://github.com\",\n" +
                        "  \"private\": false,\n" +
                        "  \"has_issues\": false,\n" +
                        "  \"has_projects\": false,\n" +
                        "  \"has_wiki\": false\n" +
                        "}")
                .when()
                .post("https://api.github.com/authorizations")
                .then()
                .extract()
                .response();

        System.out.println(response.getBody().asString());

        return response;
    }






    private List<String> getAllReposList(Response response){
        final String REPOSITORY_NAME = "name";
        return response.getBody().jsonPath().get(REPOSITORY_NAME);
    }



}
