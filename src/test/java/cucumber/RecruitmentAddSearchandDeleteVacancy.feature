@tag
Feature: RecruitmentAddSearchandDeleteVacancy
  I want to use this template for my feature file

Background:
	Given Land on OrangeHrm Page

  @Recruitment
  Scenario Outline: Add a Vacancy search the vacancy and delete vacancy
   Given Login to the application with username <username> and password <password>
    Then verify the element is displayed in homePage
    When Add Vacancy by providing vacancy details
    When Search the Vacancy added
    Then "Testerr" is displayed on the Vacancy RecruitmentPage
    When delete the added Vacancy
  	Then "Successfully Deleted" message is dispayed on Recruitment Page

 Examples: 
      | username  | password |
      | Admin |  admin123 |
