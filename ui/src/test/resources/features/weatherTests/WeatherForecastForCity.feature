Feature: Weather data

  Scenario: User can check weather forecast for the city

    Given user is on the main page
    And select the "Weather Data" menu
    When enter "Jelgava" city in the text field and press Search
    Then weather forecast for "Jelgava" city is shown