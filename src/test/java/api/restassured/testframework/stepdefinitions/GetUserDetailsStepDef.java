package api.restassured.testframework.stepdefinitions;

import api.restassured.testframework.testutils.Constants;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class GetUserDetailsStepDef {

    Response response;

    @Given("Endpoint is setup with auth token")
    public void endpointIsSetupWithAuthToken() {

    }

    @When("User hit the endpoint")
    public void userHitTheEndpoint() {
        response = when().get(Constants.GET_USER_API);
    }

    @Then("Response code should be {int}")
    public void responseCodeShouldBe(int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }

    @And("Response body should have below data")
    public void responseBodyShouldHaveBelowData(DataTable dataTable) {
        response.then().body("data.id[0]",equalTo(Integer.valueOf(dataTable.asList().get(1))))
                .log().all();
    }
}
