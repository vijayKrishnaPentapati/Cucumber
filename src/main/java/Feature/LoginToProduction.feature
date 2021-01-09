@Bvt @Prod 
Feature: Login to Production 

	In order to perform  login to Production  
As a user
I want to enter correct username and password 
Background: 
	Given user navigates to facebook website 
	When user validates to facebook homepage title 
	
Scenario: In order to Verfiy Login to facebook Production 

	Then user entered  "valid " username 
	Then user entered  "valid " password 
	Then user validates the captcha image 
	Then user "should be " sucessfully logged in 
	
	
Scenario: In order to Verfiy Login to facebook Production 

	Then user entered  "invalid " username 
	Then user entered  "invalid " password 
	Then user validates the captcha image 
	Then user "should'nt be " sucessfully logged in 
