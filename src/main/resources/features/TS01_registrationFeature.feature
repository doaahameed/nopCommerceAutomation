@smoke
Feature: 1-Registration - User should be able to register a new account


  Scenario: user registers with valid data
    Given user clicks on register button
    When user enters personal details
    And user enters company details
    And user enters password
    And user hits register
    Then user registers successfully to nop commerce
