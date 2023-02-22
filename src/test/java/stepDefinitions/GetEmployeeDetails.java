package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

public class GetEmployeeDetails {
    private static Response response;

    @When("Employee details view api is called")
    public void employeeDetails() {
        String baseUrl = "https://45.114.246.163";
        RestAssured.baseURI = baseUrl;
        RequestSpecification request = RestAssured.given();
        request.header("accept", "*/*");
        request.queryParam("employeeId", "0001");
        System.out.println(request.log().uri().toString());
        response = request.get("/swagger/web/umgmt/employees/view");
        System.out.println(response.getBody().prettyPrint());

    }

    @Then("The status of the employee details api is {string}")
    public void statusCode(String code) {
        Assert.assertEquals("status code", Integer.parseInt(code), response.statusCode());
    }


}
