package com.intertrust.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class WeatherDataPage {

    private static final By WEATHER_DATA_HEADER = byText("Total Weather Data");

    private static final By LOCATION_INPUT = byId("wxlocation");

    private static final By SEARCH_FORM = byId("wxdataform");

    public WeatherDataPage() {
        $(WEATHER_DATA_HEADER).shouldBe(visible);
    }

    public WeatherDataPage inputLocation(String city) {
        $(LOCATION_INPUT).sendKeys(city);
        return this;
    }

    public WeatherSummaryPage clickSearch() {
        $(SEARCH_FORM).$(byText("Search"))
                .click();
        return new WeatherSummaryPage();
    }


}
