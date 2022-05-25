@smoke
Feature: 3-Currency switch - user should be able to switch currency from US Dollar to Euro

  Scenario: guest user switches between currencies [$,€]
    Given guest user clicks on currency menu
    When guest user selects Euro currency
    Then currency should be changed to Euro