Feature: Add to Cart by user
Scenario: Adding products to cart
Given Home page visible
When search a product "<proname>"
Then  click on addtocart button
And increase the count for same product
And check details of the product

Examples:
|proname|
|iphone|
