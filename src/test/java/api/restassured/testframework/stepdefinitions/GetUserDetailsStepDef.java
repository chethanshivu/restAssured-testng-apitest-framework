package api.restassured.testframework.stepdefinitions;

import api.restassured.testframework.testutils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class GetUserDetailsStepDef {
    @Given("Endpoint is setup with auth token")
    public void endpointIsSetupWithAuthToken() {
        when()
                .get(Constants.GET_USER_API)
                .then()
                .statusCode(200)
                .body("data.id[0]",equalTo(7))
                .log().all();
    }

    @When("User hit the endpoint")
    public void userHitTheEndpoint() {
    }

    @Then("Response code should be {string}")
    public void responseCodeShouldBe(String arg0) {
    }

    @And("Response body should have below data")
    public void responseBodyShouldHaveBelowData() {
    }
}
