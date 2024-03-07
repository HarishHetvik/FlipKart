Feature: Search and Add to Card Module

  @search
  Scenario Outline: Verifying  search and add to card
    Given User is on flipkart page using "Chrome" browser
    Then User should verify success message "Online Shopping Site for Mobiles"
    When User search "laptop" in search box and press enter
    When User click on one search result
    And User Add selected laptop to cart
