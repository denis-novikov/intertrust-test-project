package com.intertrust;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static java.lang.String.format;
import static org.hamcrest.Matchers.equalTo;

@Epic("Weather summary")
@Feature("Get weather forecast")
public class GetWeatherDataTest extends TestBase {

    protected static String weatherDataUri = format(apiConfig.getString("weatherDataUri"), apiConfig.getString("apiKey"));

    @Test
    @Story("Get weather forecast for specific city")
    public void getWeatherData() {
        given().when()
                .get(weatherDataUri)
                .then()
                .statusCode(200)
                .and()
                .assertThat()
                .body("address", equalTo("Tallinn"));
    }
}
