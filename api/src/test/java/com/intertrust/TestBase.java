package com.intertrust;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.jupiter.api.BeforeAll;

import java.util.ResourceBundle;

import static java.util.ResourceBundle.getBundle;


public class TestBase {

    protected static ResourceBundle apiConfig = getBundle("configuration");

    private static final String BASE_URI = apiConfig.getString("baseUrl");

    @BeforeAll
    public static void setUp() {
        RestAssured.requestSpecification = new RequestSpecBuilder().setBaseUri(BASE_URI)
                .addHeader("Content-Type", "application/json")
                .addFilter(new RequestLoggingFilter())
                .build();
    }
}
