Feature: Checkout1 process
Scenario: Checkout1 product
	Background:
	Given Home page is visible for checkout
	And After1 adding a product
	And  click on checkout1 button
	And Login the user for checkout

When checkout with input fields "<firstname>", "<lastname>", "<address>", "<state>" and "<pincode>"
#all required fields
#blank fields
#special characters
#null fields
#string pincode
Examples:
|firstname|lastname|address|state|pincode|
|Akhil|Kumar|ABC colony,KPHB,Hyderabad|Telangana|123456|
|Nikhil|Varma|ABC colony,Abf street,Banglore city|Karnataka|500091|
|@$%@fddaret|@$%@342aret|@$%@fdda22435fsfrs35242|422556|35224@|
|null|null|null|null|null|
|Tarun|Kumar|ABC colony,MVC,Hyderabad|Telangana|dfshsghaj|
