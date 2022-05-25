@smoke
Feature: user should be able to hover categories and select sub category

  Scenario: user could hover categories and select sub category
    Given user hovers over category
    When user selects sub category
    Then page redirects to sub category products list