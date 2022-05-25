@smoke
Feature: 9-Shopping Cart - user should be able to add products to shopping cart

  Scenario: user adds products successfully to shopping cart
    When user adds product to his shopping cart
    Then shopping cart success message should be displayed