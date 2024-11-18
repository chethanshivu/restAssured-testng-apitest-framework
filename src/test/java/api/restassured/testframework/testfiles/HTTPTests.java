package api.restassured.testframework.testfiles;

import api.restassured.testframework.testutils.Constants;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class HTTPTests {

//    @Test
    void getUser(){
        when()
                .get(Constants.GET_USER_API)
                .then()
                .statusCode(200)
                .body("data.id[0]",equalTo(7))
                .log().all();
    }
}
