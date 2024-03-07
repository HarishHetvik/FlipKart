Feature: Proceed to Checkout Module

  @proceed
  Scenario Outline: Verifying proceed to Checkout
    Given User is on flipkart page using "Chrome" browser
    Then User should verify success message "Online Shopping Site for Mobiles"
    When User search "laptop" in search box and press enter
    When User click on one search result
    And User Add selected laptop to cart
    When User navigate to Add to cart
    Then User should verify correct item in the cart
    When User click on the Proceed to Checkout button.
