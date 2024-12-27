@tag
Feature: Title of your feature
  I want to use this template for my feature file

	Background:
	Given Land on OrangeHrm Page
	
  @tag2
  Scenario Outline: Positive scenario for Application Login 
    Given Login to the application with username <username> and password <password>
    Then verify the element is displayed in homePage

    Examples: 
      | username  | password | status  |
      | Admin |  admin123 | success |
   