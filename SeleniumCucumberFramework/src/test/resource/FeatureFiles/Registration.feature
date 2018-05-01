@ActiveFeature
Feature: This feature file cover scenario related to registration form

@Active
  Scenario: check that name and email is mandatory on registration form
    Given I click on registration link
    And I click on Submit button
    Then I got validation error message


  
