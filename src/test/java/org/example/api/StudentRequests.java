package org.example.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import org.apache.http.HttpStatus;
import org.example.api.models.Student;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.hasKey;

public class StudentRequests {

    public static Student createStudent(Student student) {

        String studentJson = JsonUtil.toJson(student);

        return given()
                .header("Content-Type", "application/json")
                .body(studentJson)
                .when()
                .post("/student")
                .then()
                .assertThat()
                .statusCode(201)
                .body("$", hasKey("_id"))
                .extract().as(Student.class, ObjectMapperType.GSON);
    }

    public static void deleteStudent(String id) {
        given()
                .delete("/student/" + id)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK);
    }
}
