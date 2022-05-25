@smoke
Feature: 8- Wishlist - user should be able to add products to wishlist
    #Test scenario 1
  Scenario: user adds product to wishlist and success message displays successfully
    When user adds product to his wishlist
    Then addition success message should be displayed

#Test scenario 2
  Scenario: number of wishlist items increased successfully
    When user adds product to his wishlist
    Then addition success message should be displayed
    Then user gets number of products in wishlist
    And number of wishlist items increased