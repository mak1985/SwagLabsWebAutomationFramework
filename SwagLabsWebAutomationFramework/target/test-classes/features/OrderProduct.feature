Feature: User should able to order products from swaglabs domain
  Scenario Outline: Valid user should able to order products
    Given User is on SwagLabs webpage
    When User enters "<username>"
    And User enters "<password>"
    And User clicks login button
    Then User should navigated to products page and see products list on page
    When User clicks add to cart
    Then Selected products should be added to card successfully
    When User clicks on cart icon
    Then Selected products should be added under your cart
    When User clicks on checkout button
    Then User should be navigated to CHECKOUT: YOUR INFORMATION page
    When User enters "<firstname>"
    And User enters "<lastname>"
    And User enters "<zipcode>"
    And User clicks on continue button
    Then User should able to see product name, cost, Payment Information, Shipping Information, Total information
    When User clicks on finish button
    Then User should see THANK YOU FOR YOUR ORDER message
    And Your order has been dispatched, and will arrive just as fast as the pony can get there

    Examples:
    |username      |password    |firstname|lastname|zipcode|
    |standard_user |secret_sauce|Makhan   |Dhar    |560066 |