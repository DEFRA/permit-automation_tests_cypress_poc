Feature: As a user I want to test MyPermits standard rules application

  @dev
  Scenario: Opening myPermits application
    Given I launch Waste Permits
    Then I am on the Apply for an environmental permit page
    When I select to start a new application
