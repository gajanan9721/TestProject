Feature: Login functionality

Background:
    Given I am on the Amazon website
Scenario: Login with correct credentials
Given user should be on login page
When user enters username as "gajananbakare18@gmail.com"
And user click on continue button
And user enters password as "Gajanan@1234"
Then user clicks on login button
Then user should redirect to amazon Dashboard



Scenario: Search the product name 
Given user should be on login page
When user enters username as "gajananbakare18@gmail.com"
And user click on continue button
And user enters password as "Gajanan@1234"
Then user clicks on login button
Given user enters search as "iphone"
And user click on search button
Then user clicks on first product
Then user should redirect to product details page
Then value of iphone product
And User press addtocart button
And add to cart message


Scenario: Search the product name and filter the list 
Given user should be on login page
When user enters username as "gajananbakare18@gmail.com"
And user click on continue button
And user enters password as "Gajanan@1234"
Then user clicks on login button
Given user enters search as "phone"
And user click on search button
And filter the list of product



