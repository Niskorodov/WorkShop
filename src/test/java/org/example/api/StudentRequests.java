package org.example.api;

import org.apache.http.HttpStatus;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasKey;

public class StudentRequests {
    public static String createStudent(String body) {
        return given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post("/student")
                .then()
                .assertThat()
                .statusCode(201)
                .body("$", hasKey("_id"))
                .extract().path("_id");
    }
    public static void deleteStudent(String id){
        given()
                .delete("/student/" + id)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK);
    }
}
