Feature: Login into account
	Existing user should be able to login to account using correct credentials
	
Scenario: Login into account with correct credentials_2
	Given user navigates to stackoverflow website_2
	And user clicks on the login button on homepage_2
	And user enters a valid username_2
	And user enters a valid password_2
	When user clicks on the login button_2
	Then user should be taken to the successful login page_2
