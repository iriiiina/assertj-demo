package com.nortal.demo

import spock.lang.Specification

abstract class Spec extends Specification {

    // initialized only ONCE over all threads (important for parallelization)
    def static beforeAll = new BeforeAll()

    static String host = "localhost"
    static int port = 8080
    static String url = "http://$host:$port/test"

}
