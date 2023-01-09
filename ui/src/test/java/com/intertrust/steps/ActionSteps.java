package com.intertrust.steps;

import com.intertrust.pages.NavigationBar;
import com.intertrust.pages.WeatherDataPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;


public class ActionSteps {

    @And("select the {string} menu")
    public void selectTheMenu(String menuItemName) {
        new NavigationBar().clickMenuItem(menuItemName);
    }

    @When("enter {string} city in the text field and press Search")
    public void enterCityInTheTextField(String city) {
        new WeatherDataPage().inputLocation(city)
                .clickSearch();
    }
}
