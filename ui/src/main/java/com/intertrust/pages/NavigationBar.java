package com.intertrust.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class NavigationBar {

    private static final By NAVIGATION_BAR = byId("navbarNav");

    public NavigationBar() {
        $(NAVIGATION_BAR).shouldBe(visible);
    }

    public WeatherDataPage clickMenuItem(String menuItemName) {
        $(byText(menuItemName)).click();
        return new WeatherDataPage();
    }
}
