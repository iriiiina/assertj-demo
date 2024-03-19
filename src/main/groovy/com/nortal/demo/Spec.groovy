package com.nortal.demo

import io.qameta.allure.restassured.AllureRestAssured
import io.restassured.RestAssured
import io.restassured.filter.log.RequestLoggingFilter
import io.restassured.filter.log.ResponseLoggingFilter
import spock.lang.Specification

abstract class Spec extends Specification {

    static String host = "localhost"
    static int port = 8080
    static String url = "http://$host:$port/test"

    def setupSpec() {
        RestAssured.filters(new AllureRestAssured(), new RequestLoggingFilter(), new ResponseLoggingFilter())
    }

}