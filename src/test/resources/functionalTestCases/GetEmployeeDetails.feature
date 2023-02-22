Feature: Get the details of employee by employee id

  Scenario: Get employee details
    When Employee details view api is called
    Then The status of the employee details api is "200"


