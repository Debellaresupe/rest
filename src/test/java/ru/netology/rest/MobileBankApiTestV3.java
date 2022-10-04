package ru.netology.rest;

import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class MobileBankApiTestV3 {
    @Test
    void shouldBeRubCurrency() {
      // Given - When - Then
      // Предусловия
        // Выполняемые действия
        // Проверки
        // специализированные проверки - лучше
        given()
            .baseUri("http://localhost:9999/api/v1")
        // Выполняемые действия
        .when()
            .get("/demo/accounts")
        // Проверки
        .then()
            .body("[0].currency", equalTo("RUB"))
      ;
    }
}
