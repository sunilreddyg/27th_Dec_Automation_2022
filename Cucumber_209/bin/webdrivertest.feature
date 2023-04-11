Feature:   Outlook test

	Scenario: Verify email validation with invalid email id
			Given navigate to outlook page
			And clicking on sigin button
			When user enter invalid email address
			And click on next button
			Then verify Error Message Displayed