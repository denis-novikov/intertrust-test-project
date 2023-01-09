package com.intertrust.steps;

import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.open;


public class NavigationSteps {

    @Given("^user is on the main page$")
    public void navigateToBaseUrl() {
        open("/");
    }
}
