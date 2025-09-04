Feature: Orders Module

  Background:
    Given User is on the home page
    Given Click on Orders tab

  @Positive
  Scenario: User1 Orders
    When existingUser login with credentials 
    And Clicked the order tab
    Then user can see all orders
    And scrolldown page and close
    
  @Positive
  Scenario: User2 Orders
    When demoUser login with credentials
    And Clicked1 the order tab
    Then added anew product
    And all placed orders
    
  @Positive
  Scenario: User3 Orders
    When favoriteUser login with credentials
    And Clicked2 the order tab
    Then place the order from favourites
    And order page opened
    