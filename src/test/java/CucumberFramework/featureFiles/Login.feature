Feature: Login into account
	Existing user should be able to login to account using correct credentials
	
Scenario: Login into account with correct credentials
	Given user navigates to stackoverflow website
	And user clicks on the login button on homepage
	And user enters a valid username
	And user enters a valid password
	When user clicks on the login button
	Then user should be taken to the successful login page
