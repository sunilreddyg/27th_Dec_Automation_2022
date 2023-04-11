Feature: Login Invalid tests
	Scenario: Test with invalid password
		Given OpenChrome and load webpage
		When user enter valid username and invalid password
		And click on Login button
		Then Verify Password Error message displayed