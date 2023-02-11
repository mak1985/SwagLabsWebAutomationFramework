Feature: User should able to order products from swaglabs domain
  Scenario Outline: Valid user should able to order products
    Given User is on SwagLabs webpage
    When User Enter my username as "<username>"
    When User enter products as "<productName>"

    Examples:
    |username|
    |Rakesh  |