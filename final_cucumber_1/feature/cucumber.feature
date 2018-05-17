Feature: ice_hrm Login


Background: Sucessfull Login with Valid Credentials in ice_hrm
Given User is on Home Page
When User navigate to Login Page
	And  enters Username and Password and click on login button
Then  Sucessfull 

@Display_All_Users
Scenario: Display all the modules
Given User Must be Logged in the Account
When User clicks on Employee
And User click on add employee and the employee
Then Message Displayed employee is added