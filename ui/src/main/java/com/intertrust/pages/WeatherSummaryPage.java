package com.intertrust.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;


public class WeatherSummaryPage {

    private static final By WEATHER_SUMMARY = byId("weatherSummary");

    public WeatherSummaryPage() {
        $(WEATHER_SUMMARY).shouldBe(visible);
    }

    public String getWeatherSummaryHeader() {
        return $(WEATHER_SUMMARY).$(".h3")
                .getText();
    }

}
