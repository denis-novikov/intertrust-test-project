package com.intertrust.steps;

import com.intertrust.pages.WeatherSummaryPage;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;


public class AssertionSteps {

    @Then("weather forecast for {string} city is shown")
    public void weatherForecastForCityIsShown(String city) {
        String weatherSummaryText = new WeatherSummaryPage().getWeatherSummaryHeader();
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(weatherSummaryText)
                .as("Weather summary is not for " + city)
                .containsIgnoringCase(city);
        softAssertions.assertThat(weatherSummaryText)
                .as("Weather summary is not forecast")
                .containsIgnoringCase("Forecast");
        softAssertions.assertAll();
    }
}
