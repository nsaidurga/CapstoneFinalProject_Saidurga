Feature: Search Module

Background:
	Given Home page available
	When click on search input field

Scenario: Multiple search words	
Then Entering the search words "<name>"

Examples:
|name|
|iphone|
|samsung|
|one plus|
|pixel|

Scenario: Search Partial Product
And Search with Partial Product "<partial>"

Scenario: Search Invalid Keyword
And Search with Invalid Keyword "<invalid>"

Scenario: Search Special Characters
And Search with Special Characters "<special>"

Scenario: Search Blank Input
And Search with Blank Input "<blank>"

Scenario: Search extra spaces Input
And Search with extra spaces Input "<space>"

Scenario: Case Sensitivity Check 
And Case Sensitivity Check "<case1>"

And Listed the matched results

Example:
|partial|invalid|special|blank|space|case1|
|iph|dfsgter5342@|$@$@%%||   |iPoNE|
