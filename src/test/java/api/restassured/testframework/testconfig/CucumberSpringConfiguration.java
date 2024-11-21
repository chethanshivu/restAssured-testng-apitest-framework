package api.restassured.testframework.testconfig;

import api.restassured.testframework.TestFrameworkApplicationTests;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;



@CucumberContextConfiguration
@SpringBootTest(classes = TestFrameworkApplicationTests.class)
public class CucumberSpringConfiguration {
}
