@Sanity 
Feature: Login 

	In order to perform sucessful login 
As a user
I want to enter correct username and password 

Scenario Outline: In order to Verfiy Login to facebook 
	Given user navigates to facebook website 
	When user validates to facebook homepage title 
	Then user entered  "<username> " username 
	Then user entered  "<password> " password 
	Then user select age category 
		| Age | Location |
		|below 18 | india |
		|above 18 | USA |
	Then user "<LoginType> " sucessfully logged in 
	
	Examples: 
	
		| username | password | LoginType |
		| valid  | valid | should be|
		| invalid | invalid | should'nt| 
 