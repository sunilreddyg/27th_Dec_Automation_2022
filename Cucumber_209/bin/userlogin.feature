Feature: Testing login feature

	Scenario: Testing Login Valid Scenario
		Given OpenChrome and load webpage
		When User enter admin usernmae and password
			And click on Login button
		Then Verify Account Page displayed
		
	Scenario:  Testing Login Invalid Scenario
	
		When user enter invalid username and invalid password
			And click on Login button
		Then Verify error text displayed
		
		
		
		