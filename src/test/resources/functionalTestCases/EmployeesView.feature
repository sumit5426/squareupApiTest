@regression
Feature: Square Up Employee Details

  @smoke
  Scenario: Get all employee details
#    action
    When The employee view api is called
#    Assertion or Validation
    Then The status of employee view api code is "200"
