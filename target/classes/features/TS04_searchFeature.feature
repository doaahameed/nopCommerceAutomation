@smoke
Feature: 4-Search - guest user should be able to search for any product

  Scenario: guest user searches for a product keyword and view results successfully
    Given guest user clicks on search tab
    When guest user enters search keyword "Book"
    And guest user hits enter to search
    Then search results are displayed for user with relevant data

  Scenario: guest user searches with sku and view results successfully
    Given guest user clicks on search tab
    When guest user enters search sku "PRIDE_PRJ"
    And guest user hits enter to search
    Then search results are displayed for user with relevant data