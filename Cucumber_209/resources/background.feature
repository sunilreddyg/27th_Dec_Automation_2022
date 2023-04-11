Feature:  Verifying book version

	Background: 
		Given Navigating to Page

	Scenario:  Check Book1 Availability
		When book1 is selected
		Then Check Author of book is "Sam"
		
	Scenario:  Check Book2 Availability
		When book2 is selected
		Then Check Author of book2 is "Arjun"
		
	Scenario:  Check Book3 Availability
		When book3 is selected
		Then Check Author of book3 is "sunil"