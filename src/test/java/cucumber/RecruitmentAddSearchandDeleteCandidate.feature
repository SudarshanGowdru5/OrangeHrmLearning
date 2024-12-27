@tag
Feature: RecruitmentAddSearchandDeleteVacancy
  I want to use this template for my feature file

Background:
	Given Land on OrangeHrm Page
	
  @Recruitment
  Scenario Outline: Title of your scenario outline
     Given Login to the application with username <username> and password <password>
    Then verify the element is displayed in homePage
    When Add Candidate by providing candidate details
    When Search the candidate added
    Then "Sudarshan S" is displayed on the RecruitmentPage
    When delete the added candidate
  	Then "Successfully Deleted" message is dispayed on Recruitment Page

    Examples: 
      | username  | password |
      | Admin |  admin123 |
