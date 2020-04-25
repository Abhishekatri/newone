Feature: scenario outline

 

Scenario Outline:− Register functionality for testmeapp.

 

Given user navigates to testmeapp

 

When I enter Username as "<username>" and Password as "<password>"

 

Then login should be successful

 

Examples: −

| username  | password  |
| lalitha | password1 |
| lalitha | password123 |