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
    Then a1dded112 anew product "<firstname1>", "<lastname1>", "<address1>", "<state1>" and "<pincode1>"
    And all placed orders

Examples:
|firstname1|lastname1|address1|state1|pincode1|
|Tarun|Star|KLF colony,Vizag|AP|435263|    
 
@Positive
  Scenario: User3 Orders
    When favoriteUser login with credentials
    And Clicked2 the order tab
    Then p1lace112 the order from favourites "<firstname>", "<lastname>", "<address>", "<state>" and "<pincode>"
    And order page opened
    
Examples:
|firstname|lastname|address|state|pincode|
|Akhil|Kumar|ABC colony,KPHB,Hyderabad|Telangana|123456|
