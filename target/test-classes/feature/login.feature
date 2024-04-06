Feature: Validate login fields of Facebook Application

@pen
Scenario Outline: Validate signup page

Given user is on Facebook Application Browser
When user enter "<username>" and "<password>"
And user click on login button

 Examples: 
      | username  | password |
      |personname |Apple@123|
      
 @pen     
Scenario Outline: Validate signup page

Given user is on Facebook Application Browser
When user enter "<username>" and "<password>"
And user click on login button

 Examples: 
      | username  | password |
      |personnam |Apple@123|

Scenario Outline: Validate signup page

Given user is on Facebook Application Browser
When user enter "<username>" and "<password>"
And user click on login button

 Examples: 
      | username  | password |
      |personname |Apple@12|    