package stepDefinitions;

import apiEngine.request.CreateEmployee;
import apiEngine.request.EmployeeULBDesignationEntity;
import apiEngine.response.CreateEmployeePositiveResponse;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeOperationSteps {

    private static Response response;
    private static CreateEmployeePositiveResponse createEmployeePositiveResponse;
    private static final String baseUrl = "https://squareupuate.com/squareupdevwosubcomponentsbe";
    private static final String empId = "auto_" + LocalDate.now() + Math.random();
    private static final String token = "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJiZXRraWFkbWluIiwiZXhwIjoxNjgxODAzNzQ1LCJpYXQiOjE2ODE3ODkzNDV9.Ah-7Ohi5JOHkF-v7zACCRXS5G02i3P7awj9tybKmzi61EtwCjucaJNCKhnFA28oqn2I9lhpvLf9CFKUO4n80KA";

    //Serialization
    @When("The employee creation api is called")
    public void the_employee_creation_api_is_called(DataTable data) throws JsonProcessingException {
        //data Layer from cucumber feature file
        //String payload = "{\"employeeId\":\"" + empId + "\",\"name\":\"aaaa\",\"mobileNumber\":\"9999999999\",\"email\":\"aa@leadwinner.com\",\"address\":\"Hyderabad\",\"designationId\":\"4\",\"gender\":\"Male\",\"profilePicture\":\"\",\"employeeULBDesignationEntities\":[{\"ulbCode\":\"87940\",\"designationId\":4,\"activeStatus\":true}]}";
        CreateEmployee createEmployee = new CreateEmployee();
        createEmployee.setEmployeeId(empId);
        createEmployee.setName(data.cell(0, 1));
        createEmployee.setMobileNumber(data.cell(1, 1));
        createEmployee.setEmail(data.cell(2, 1));
        createEmployee.setAddress(data.cell(3, 1));
        createEmployee.setDesignationId(Integer.valueOf(data.cell(4, 1)));
        createEmployee.setGender(data.cell(5, 1));
        createEmployee.setProfilePicture(String.valueOf(data.cell(6, 1)));

        //List employeeULBDesignationEntities
        EmployeeULBDesignationEntity employeeULBDesignationEntity = new EmployeeULBDesignationEntity();
        employeeULBDesignationEntity.setUlbCode(data.cell(7, 1));
        employeeULBDesignationEntity.setDesignationId(Integer.valueOf(data.cell(8, 1)));
        employeeULBDesignationEntity.setActiveStatus(Boolean.valueOf(data.cell(9, 1)));
        List<EmployeeULBDesignationEntity> allEmployeeULBDesignationEntity = new ArrayList<EmployeeULBDesignationEntity>();
        allEmployeeULBDesignationEntity.add(employeeULBDesignationEntity);
        createEmployee.setEmployeeULBDesignationEntities(allEmployeeULBDesignationEntity);
        ObjectMapper objectMapper = new ObjectMapper();
        String createEmpJson= objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(createEmployee);
        //System.out.println(createEmpJson);

        Map<String, Object> headerMap = new HashMap<>();
        headerMap.put("Authorization", token);
        headerMap.put("accept", "*/*");
        headerMap.put("Content-Type", "application/json");
        headerMap.put("Host", "squareupuate.com");
        headerMap.put("employeeId", "betkiadmin");
        headerMap.put("ulbCode", "ULB1");

        // Action of the test layer
        RestAssured.baseURI = baseUrl;
        RequestSpecification request = RestAssured.given();
        request.headers(headerMap);
        request.body(createEmpJson);
        response = request.post("/web/umgmt/employees");
        // Validation of the test layer
//        System.out.println(response.asPrettyString());
    }

    @Then("The employee creation api response is {int}")
    public void the_employee_creation_api_response_is(int responseCode) {
        Assert.assertEquals(responseCode,response.statusCode());
    }

//Deserialization
    @Then("The employee response will be {string}")
    public void validateCreateEmpResponse(String expectedResult) {
       createEmployeePositiveResponse = response.getBody().as(CreateEmployeePositiveResponse.class);
       Assert.assertEquals(expectedResult,createEmployeePositiveResponse.getMessage());
    }
}
