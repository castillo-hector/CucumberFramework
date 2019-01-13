Feature: Submit data to webdriveruniversity.com using contact us form
	A User should be to submit information via the contact us form
	if a user clicks on the reset button then all information should be remove from the contect us form
	
Background:
	Given user navigates to system webdriveruniversity
	When user clicks on the contact us button
	And user enter his user first name
	And user enter his user last name
	
Scenario: Submit information using the contact us form
	And user enter his "valid" user email
	And user enter his comment
	When user click on submit button
	Then then information should succesfully be submitteb via the contact us form

Scenario: Enter incorrect email addess in contact form and get warning message
	And user enter his "invalid" user email
	And user enter his comment
	When user click on submit button
	Then the system sends warning message
