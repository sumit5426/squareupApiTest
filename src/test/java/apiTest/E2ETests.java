package apiTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

public class E2ETests {

    public static void main(String[] args) {
        String baseUrl = "https://45.114.246.163";

        RestAssured.baseURI = baseUrl;
        RequestSpecification request = RestAssured.given();
        request.header("accept", "*/*");
        request.header("designationId", "0001");
        request.header("ulbCode", "ULB1");
        //request.queryParam("employeeId","squareupadmin");
        Response response = request.get("/squareup_sna_subcomponents/web/umgmt/employees");

        //System.out.println(response.statusCode());
        //System.out.println(response.getBody().prettyPrint());
        Assert.assertEquals("Status code",200,response.statusCode());

    }
}
