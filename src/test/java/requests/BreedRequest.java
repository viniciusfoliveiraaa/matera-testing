package requests;

import constants.Constants;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class BreedRequest {

    public static Response get(int limit) {
        return RestAssured.given()
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON)
                .baseUri(Constants.BREAD_URL)
                .when()
                .queryParam("limits", limit)
                .get("/breeds");
    }

    public static Response getWithInvalidValue() {
        return RestAssured.given()
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON)
                .baseUri(Constants.BREAD_URL)
                .when()
                .queryParam("limits", "aa")
                .get("/breeds");
    }

}
