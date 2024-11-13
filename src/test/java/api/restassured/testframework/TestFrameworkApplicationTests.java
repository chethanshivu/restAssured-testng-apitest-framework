package api.restassured.testframework;

import groovy.util.logging.Slf4j;
//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

@SpringBootTest
@Slf4j
class TestFrameworkApplicationTests {

	@Test
	void contextLoads() {
		when().get("https://dummy-json.mock.beeceptor.com/todos")
				.then().assertThat().statusCode(200);
	}

}
