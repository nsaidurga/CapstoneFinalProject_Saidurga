Feature: Checkout process
Scenario: Checkout product
Given Home4 page visible
When After adding a product
Then  click on checkout button
And Login user
And verify fill all fields
And verify without filled fields
And verify all fields with special characters
And verify all fields with null values
And verify postal code with nonNumbers 
And close the page
