package com.nortal.demo

import io.restassured.http.ContentType

import static io.restassured.RestAssured.given
import static org.hamcrest.CoreMatchers.equalTo
import static org.hamcrest.CoreMatchers.notNullValue
import static org.hamcrest.CoreMatchers.nullValue
import static org.hamcrest.MatcherAssert.assertThat

class Hamcrest extends Spec {

    def "Bad example of body assertions"() {
        expect:
        given()
                .contentType(ContentType.JSON)
                .when()
                .get(url)
                .then().statusCode(200)
                .body("id", equalTo("100"),
                        "lastName", equalTo("Lastname"),
                        "firstName", equalTo("Firstname"),
                        "birthDay", notNullValue(),
                        "deathDay", nullValue(),
                        "gender", equalTo("Man"))
    }

    def "Good example of body assertions using Map variable"() {
        when:
        Map responseBody = given()
                .contentType(ContentType.JSON)
                .when()
                .get(url)
                .then().statusCode(200)
                .extract().path("")

        then:
        assertThat(responseBody["id"], equalTo("100"))
        assertThat(responseBody["lastName"], equalTo("Lastname"))
        assertThat(responseBody["firstName"], equalTo("Firstname"))
        assertThat(responseBody["birthDay"], notNullValue())
        assertThat(responseBody["deathDay"], notNullValue())
        assertThat(responseBody["gender"], equalTo("Man"))
    }


}
