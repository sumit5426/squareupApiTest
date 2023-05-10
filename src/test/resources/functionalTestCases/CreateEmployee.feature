@regression @11857
Feature: Create Employee for the square up

  @smoke
  Scenario Outline: Validate the employee creation with valid and invalid data
    When The employee creation api is called
      | name                                         | <name>                                         |
      | mobileNumber                                 | <mobileNumber>                                 |
      | email                                        | <email>                                        |
      | address                                      | <address>                                      |
      | designationId                                | <designationId>                                |
      | gender                                       | <gender>                                       |
      | profilePicture                               | <profilePicture>                               |
      | employeeULBDesignationEntities_ulbCode       | <employeeULBDesignationEntities_ulbCode>       |
      | employeeULBDesignationEntities_designationId | <employeeULBDesignationEntities_designationId> |
      | employeeULBDesignationEntities_activeStatus  | <employeeULBDesignationEntities_activeStatus>  |

    Then The employee creation api response is <responseCode>
    And The employee response will be "<expectedResult>"
    Examples:
      | name       | mobileNumber | email                 | address   | designationId | gender | profilePicture | employeeULBDesignationEntities_ulbCode | employeeULBDesignationEntities_designationId | employeeULBDesignationEntities_activeStatus | responseCode | expectedResult                |
      | autotester | 9999999999   | autotester@tester.com | Hyderabad | 4             | Male   |                | 87940                                  | 4                                            | true                                        | 201          | Employee created Successfully |
