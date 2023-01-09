package com.intertrust;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.ex.ElementNotFound;
import io.cucumber.java.Before;
import org.openqa.selenium.Cookie;

import java.util.ResourceBundle;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static java.util.ResourceBundle.getBundle;


public class TestBase {

    private static ResourceBundle resourceBundle = getBundle("configuration");

    @Before
    public static void setUp() {
        clearBrowserCookies();
        closeWebDriver();

        Configuration.baseUrl = resourceBundle.getString("baseUrl");
        Configuration.timeout = Long.parseLong(resourceBundle.getString("implicitWaitMillis"));
        Configuration.browserSize = resourceBundle.getString("browserSize");

        open("/");

        try {
            $(byText("Accept all cookies")).shouldBe(visible)
                    .click();
        } catch (ElementNotFound ex) {
            System.out.println("Cookie consent popup is not visible");
        }

    }
}
