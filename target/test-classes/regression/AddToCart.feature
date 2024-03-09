Feature: To validate login

Scenario: To validate login using valid username and valid password

Given user starts "chrome" browser
When Open the ShopNow "https://www.flipkart.com"
Then Validate the homepage loaded successfully
When Enter "laptop" in searchBar
And Click on first search Result
#Then Product Info is visible
And Click on Add to Cart
And Click on Shopping Cart Button
Then Verify the Product is added to the Cart/Not
When Click on Place Order
#Then Verify the ViewCartPage
When Enter PhoneNumber as "9948499014"
#And Click On Continue
And Enter OTP and Click on Login
Then Verify the User is Successfully Logged in