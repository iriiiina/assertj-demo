# WireMock Standalone Application

## Documentation

https://wiremock.org/docs/standalone/java-jar/

## Running

```shell
java -jar wiremock-standalone-3.4.1.jar
```

WireMock service is available at http://localhost:8080 by default. Use `--port` flag if you need different port number, but don't forget to change it in the code as well.

```shell
java -jar wiremock-standalone-3.4.1.jar --port 9999
```

## Endpoint Mappings

Endpoint mappings are located at `mappings/*.json` files.

There is described only one endpoint for demo purpose:

```
GET /test
Content-Type: "application/json"

Response:
Status Code 200
{
  id: "100",
  lastName: "Lastname",
  firstName: "Firstname",
  birthDay: "1972-12-31T00:00:00.0Z",
  deathDay: null,
  gender: "Man"
}
```