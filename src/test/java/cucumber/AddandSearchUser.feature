
Feature: Navigate through the OrangeHrm page
  I want to use this template for my feature file

Background:
	Given Land on OrangeHrm Page

  @tag2
  Scenario Outline: Add the user and search the added user
  Given Login to the application with username <username> and password <password>
    Then verify the element is displayed in homePage
    When Add the user by entering the details
    Then Successful popup is dispayed
    When search the user added
    Then "Sudas" is displayed on the Homepage
	
    Examples: 
      | username  | password | status  |
      | Admin |  admin123 | success |
