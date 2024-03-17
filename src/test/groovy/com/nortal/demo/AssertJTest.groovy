package com.nortal.demo

import io.restassured.http.ContentType

import static io.restassured.RestAssured.given
import static org.assertj.core.api.Assertions.assertThat

class AssertJTest extends Spec {

    def "Good example of body assertions using Map variable"() {
        when:
        Map responseBody = given()
                .contentType(ContentType.JSON)
                .when()
                .get(url)
                .then().statusCode(200)
                .extract().path("")

        then:
        assertThat(responseBody["id"]).isEqualTo("100")
        assertThat(responseBody["lastName"]).isEqualTo("Lastname")
        assertThat(responseBody["firstName"]).isEqualTo("Firstname")
        assertThat(responseBody["birthDay"]).isNotNull()
        assertThat(responseBody["deathDay"]).isNull()
        assertThat(responseBody["gender"]).isEqualTo("Man")
    }
}