Feature: Open Flipkart Website Module

  @chrome
  Scenario Outline: Verifying user enter flipkart website using Chrome Browser
    Given User is on flipkart page using "Chrome" browser
    Then User should verify success message "Online Shopping Site for Mobiles"

  @edge
  Scenario Outline: Verifying user enter flipkart website using Edge Browser
    Given User is on flipkart page using "Edge" browser
    Then User should verify success message "Online Shopping Site for Mobiles"
