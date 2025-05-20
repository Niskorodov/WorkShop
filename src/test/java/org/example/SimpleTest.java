package org.example;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.apache.http.HttpStatus;
import org.example.api.StudentRequests;
import org.example.api.models.Student;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasKey;

public class SimpleTest {


    @BeforeAll
    public static void setupTests() {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        RestAssured.baseURI = "https://crudcrud.com/api/9e3e34f1c5aa4498958a1dce6c0295e8";

    }

    @Test
    public void userShouldBeAbleCreateStudent() {
        // Student student = new Student("Саша Осипов", 2, "");
        Student student = Student
                .builder()
                .name("Саша Осипов")
                .grade(2)
                .build();

        Student createStudent = StudentRequests.createStudent(student);
    }

    @Test
    public void userShouldBeAbleDeleteExistingStudent() {
        Student student = Student
                .builder()
                .name("Саша Осипов")
                .grade(2)
                .build();

        Student createStudent = StudentRequests.createStudent(student);

        StudentRequests.deleteStudent(createStudent.getId());

        given()
                .get("/student/" + createStudent.getId())
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_NOT_FOUND);
    }
}
