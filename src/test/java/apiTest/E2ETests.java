package apiTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class E2ETests {

    public static void main(String[] args) {
        String baseUrl="https://data.binance.com";

        RestAssured.baseURI=baseUrl;
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");

        Response response = request.get("/api/v3/ticker/24hr");

        System.out.println(response.getBody().prettyPrint());
    }
}
