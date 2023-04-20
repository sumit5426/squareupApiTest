package stepDefinitions;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


public class EmployeeOperation {
    private static Response response;
    private static final String baseUrl = "https://squareupuate.com/squareupdevwosubcomponentsbe";
    private static final String empId="auto_" + LocalDate.now() + Math.random() ;

    public static void getEmployeeList() {

        //data Layer from cucumber feature file
        Map<String, Object> headerMap = new HashMap<>();
        headerMap.put("Authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJiZXRraWFkbWluIiwiZXhwIjoxNjgxODAzNzQ1LCJpYXQiOjE2ODE3ODkzNDV9.Ah-7Ohi5JOHkF-v7zACCRXS5G02i3P7awj9tybKmzi61EtwCjucaJNCKhnFA28oqn2I9lhpvLf9CFKUO4n80KA");
        headerMap.put("accept", "*/*");
        headerMap.put("Host", "squareupuate.com");
        headerMap.put("designationId", "0");
        headerMap.put("ulbCode", "ULB1");

        Map<String, Object> queryParamMap = new HashMap<>();
        queryParamMap.put("offset", "1");
        queryParamMap.put("pageSize", "2");


        // Action of the test layer
        RestAssured.baseURI = baseUrl;
        RequestSpecification request = RestAssured.given();
        request.headers(headerMap);
        request.queryParams(queryParamMap);
        response = request.get("/web/umgmt/employees");

        // Validation of the test layer
        System.out.println(response.statusCode());
        System.out.println(response.asPrettyString());

    }


    public static void createEmployee() {

        //data Layer from cucumber feature file

        String payload = "{\"employeeId\":\""+empId+"\",\"name\":\"aaaa\",\"mobileNumber\":\"9999999999\",\"email\":\"aa@leadwinner.com\",\"address\":\"Hyderabad\",\"designationId\":\"4\",\"gender\":\"Male\",\"profilePicture\":\"\",\"employeeULBDesignationEntities\":[{\"ulbCode\":\"87940\",\"designationId\":4,\"activeStatus\":true}]}";

        Map<String, Object> headerMap = new HashMap<>();
        headerMap.put("Authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJiZXRraWFkbWluIiwiZXhwIjoxNjgxODAzNzQ1LCJpYXQiOjE2ODE3ODkzNDV9.Ah-7Ohi5JOHkF-v7zACCRXS5G02i3P7awj9tybKmzi61EtwCjucaJNCKhnFA28oqn2I9lhpvLf9CFKUO4n80KA");
        headerMap.put("accept", "*/*");
        headerMap.put("Content-Type", "application/json");
        headerMap.put("Host", "squareupuate.com");
        headerMap.put("employeeId", "betkiadmin");
        headerMap.put("ulbCode", "ULB1");

        // Action of the test layer
        RestAssured.baseURI = baseUrl;
        RequestSpecification request = RestAssured.given();
        request.headers(headerMap);
        request.body(payload);
        response = request.post("/web/umgmt/employees");

        // Validation of the test layer
        System.out.println(response.statusCode());
        System.out.println(response.asPrettyString());

    }

    public static void main(String[] args) {


        createEmployee();
        getEmployeeList();


    }
}
