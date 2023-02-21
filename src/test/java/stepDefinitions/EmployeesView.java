package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.internal.ResponseSpecificationImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

public class EmployeesView {
    private static Response response;
    @When("The employee view api is called")
    public void the_employee_view_api_is_called() {
        String baseUrl = "https://45.114.246.163";

        RestAssured.baseURI = baseUrl;
        RequestSpecification request = RestAssured.given();
        request.header("accept", "*/*");
        request.header("designationId", "0001");
        request.header("ulbCode", "ULB1");
        //request.queryParam("employeeId","squareupadmin");
        response = request.get("/squareup_sna_subcomponents/web/umgmt/employees");
        //System.out.println(response.getBody().prettyPrint());
    }



    @Then("The status of employee view api code is {string}")
    public void the_status_of_employee_view_api_code_is(String code) {
         Assert.assertEquals("Status code",Integer.parseInt(code),response.statusCode());
    }

}
