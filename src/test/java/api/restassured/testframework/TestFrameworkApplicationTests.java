package api.restassured.testframework;

import api.restassured.testframework.testutils.Constants;
import groovy.util.logging.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

@SpringBootTest
@Slf4j
class TestFrameworkApplicationTests {

	@Test
	void contextLoads() {
		when().get(Constants.GET_USER_API)
				.then().assertThat().statusCode(200);
	}

}
