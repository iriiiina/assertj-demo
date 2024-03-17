# AssertJ - Personal Experience

Personal experience about using [AssertJ](https://assertj.github.io/doc/) in a [Hamcrest](https://hamcrest.org/) project. What's the difference, how does it look like in real life and how does it feel. It may be interesting to all specialists involved in writing automated tests, like unit, integration, E2E tests. Mainly Java-based though.

# Who Am I?

IRINA IVANOVA / Senior Test Automation Engineer / EE SK ID Team

# Agenda

* Tech Stack: [Maven](https://maven.apache.org/), [Groovy](https://groovy-lang.org/), [Spock](https://spockframework.org/), [REST Assured](https://rest-assured.io/), [Allure Report](https://allurereport.org/) 
* AssertJ vs Hamcrest
  * Community Activity
    * https://github.com/assertj/assertj
    * https://github.com/hamcrest/JavaHamcrest
  * Documentation
    * https://assertj.github.io/doc
    * https://hamcrest.org/JavaHamcrest/index
  * Comparison table: https://codingnconcepts.com/java/java-test-assertion-libraries/
  * Examples
    * Syntax, Import, Soft Assertions https://dzone.com/articles/hamcrest-vs-assertj-assertion-frameworks-which-one
    * Custom assertions https://www.kapresoft.com/java/2023/10/27/java-assertj-vs-hamcrest-assertion.html#writing-custom-assertions
* Demo
* Real Life Example
  * FILE-ARCHIVE
  * MID-RA
* Bonus
  * Publication "Hamcrest vs AssertJ: an Empirical Assessment of Tester Productivity", https://sepl.dibris.unige.it/publications/2019-leotta-QUATIC.pdf
  * AssertJ Generator https://joel-costigliola.github.io/assertj/assertj-assertions-generator.html
  * Migrate Hamcrest to AssertJ https://docs.openrewrite.org/running-recipes/popular-recipe-guides/hamcrest-to-assertj
* Conclusion
* Questions

# Demo

## Wiremock

Some tests are using RestAssured, so they need a running Wiremock to succeed. See `wiremock/README.md` for details. Or use short command for running standalone mock on `http://localhost:8080`:

```shell
cd wiremock &&
  java -jar wiremock-standalone-3.4.1.jar
```

## Tests

Run tests in IDE or in console using Maven wrapper:

```shell
./mvnw clean test
```

## Allure report
NB! [On Windows this will leak the report serving processes](https://github.com/allure-framework/allure-java/issues/836)

```shell
./mvnw allure:serve
```