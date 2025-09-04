Feature: Favourites Module

  Background:
    Given User on home page
    Given Click on favourites tab
  @Positive
  Scenario: Favourites adding
    When demoUser1 login with credentials
    And no favourites found
    Then Add few favourites
    And click on the favouritestab  
    And all favourites here 
    
  @Negative
  Scenario: Favourites remove from favuser
    When favoriteUser1 login with credentials
    And you can see all favourites
    Then Remove all favourites
    And Returned to home page
    And click on favourites
    And After the favourites page
    
  @Positive
  Scenario: Add to cart from Favourites
    When favoriteUser2 login with credentials
    Then place1 the order from favourites
    And order1 page opened   
    
    