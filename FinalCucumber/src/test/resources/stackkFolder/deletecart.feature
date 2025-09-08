Feature: Delete from Cart

Scenario: Delete products from Cart
Given Home page1 visible
When search a1 product "<proname>"
Then  add multiple products to cart
And remove all items from cart
And ensure cart is empty

Examples:
|proname|
|iphone|
