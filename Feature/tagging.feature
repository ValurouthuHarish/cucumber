@FunctionalTest
Feature: Free CRN Application Testing
@SmokeTest @RegressionTest
Scenario: Login with correct user name and password
Given This is a valid login

@RegressionTest
Scenario: Login with incorrect user name and password
Given This is a invalid login

@SmokeTest
Scenario: create a contact
Given This is a valid contact

@RegressionTest
Scenario: create a deal
Given This is a valid deal

@RegressionTest
Scenario: verify left panel links
Given This is a valid deal

@SmokeTest @RegressionTest
Scenario: search a deal 
Given This is a search deal test

@SmokeTest @RegressionTest
Scenario: search a contact 
Given This is a search contact test

@SmokeTest @RegressionTest
Scenario: search a case 
Given This is a search case

@SmokeTest @RegressionTest
Scenario: search a task 
Given This is a search task

@SmokeTest @RegressionTest
Scenario: search a call 
Given This is a search call test

@SmokeTest @RegressionTest
Scenario: search a email 
Given This is a search email test

@SmokeTest @RegressionTest
Scenario: search a docs 
Given This is a search docs test

@SmokeTest @RegressionTest @End2End
Scenario: search a fogs 
Given This is a search email fogs

@SmokeTest @RegressionTest @End2End
Scenario: search a report 
Given This is a search report

@End2End
Scenario:logout
Given Application logout test


