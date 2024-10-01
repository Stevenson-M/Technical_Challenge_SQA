Feature: Add product to shopping cart

  Scenario: Add a product and validate the price
    Given User is on the Aliexpress homepage
    When I search for the product "calculadora"
    And  User add 3 quantities of the product to the cart
    And go to the shopping cart
    Then User should see the correct price in the cart








