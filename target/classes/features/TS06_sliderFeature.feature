@smoke
Feature: 6-Home slider - user should be able to click on any slider to view related products

  Scenario: user clicks on first slider and got redirected to relevant product page
    When user click on first slider
    Then related product page opens for first slider

  Scenario: user clicks on second slider and got redirected to relevant product page
    When user clicks on second slider
    Then related product page opens for second slider