Feature: Sign In functionality

  Background:
    Given User is on the Sign In page

  @Positive
  Scenario: Sign In User1
    When User1 enters username 
    And Enters password1
    And Clicks on the Sign In button1
    Then User1 should be successfully logged in
    And Homepage1 should be displayed
    
  @Positive
  Scenario: Sign In User2
    When User2 enters username 
    And Enters password2
    And Clicks on the Sign In button2
    Then User2 should be successfully logged in
    And Homepage2 should be displayed
    
  @Positive
  Scenario: Sign In User3
    When User3 enters username
    And Enters password3
    And Clicks on the Sign In button3
    Then User3 should be successfully logged in
    And Homepage3 should be displayed
    
  @Positive
  Scenario: Sign In User4
    When User4 enters username
    And Enters password4
    And Clicks on the Sign In button4
    Then User4 should be successfully logged in
    And Homepage4 should be displayed
    
  @Positive
  Scenario: Sign In User5
    When User5 enters username
    And Enters password5
    And Clicks on the Sign In button5
    Then User unable to sign in
    And Your account has been locked.
    
