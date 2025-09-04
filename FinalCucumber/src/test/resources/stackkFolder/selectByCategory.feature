Feature: Select category

Background:
    Given Home2 page visible
    Given check available categories

Scenario: Select product by Single Category
When  click on single category button
Then See the specified selected category of the products

Scenario: Select product by Double Category
When  click on two category buttons
Then See the two specified selected categories of the products

Scenario: Select product by Triple Category
When  click on three category buttons
Then See the three particular selected categories of the products

Scenario: Select product by Fourth Category
When  click on four category buttons
Then See the four particular selected categories of the products
