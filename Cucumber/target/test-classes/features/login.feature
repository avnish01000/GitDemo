Feature: Google Search

Background:
Given Backgroun1
When Background2
Then Background3

@Regression @Smoke
Scenario: Google Search with Selenium Keyword
Given Launch Google
When Enter Selenium in search Box
Then Results are displayed 

@Smoke
Scenario: Google Search with Regular Expression
Given Launch Google
When Eneter "Selenium" in search box
Then Results are displayed

@Functional
Scenario: Form Submission using Data Driven DataTable
Given Launch Form
When Enter Below USer Details
|Avnish|Sharma|
And Click Submit Button
Then Form is submitted successfully 

@Regression
Scenario Outline: Parameterize Test runs
Given Launch Login Page
When Enter <Username> and <Password>
Then Verify Login is successful

Examples:
|Username|Password|
|user1|pass1|
|user2|pass2|
|user3|pass3|




