Feature: Tagged Hooks
@First
Scenario: Login with correct user name and password
Given This is a valid login

@Second
Scenario: Login with incorrect user name and password
Given This is a invalid login

@Third
Scenario: create a contact
Given This is a valid contact