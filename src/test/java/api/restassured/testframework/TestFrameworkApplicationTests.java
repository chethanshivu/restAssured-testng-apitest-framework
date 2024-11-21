package api.restassured.testframework;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.DataProvider;



@SpringBootTest
@CucumberOptions(features = "src/test/resources/features",
        glue = {"api.restassured.testframework.stepdefinitions",
                "api.restassured.testframework.testconfig"},
        tags = "@Regression",
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json",
                "testng:target/cucumber-reports/cucumber.xml"})
public class TestFrameworkApplicationTests extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }

}
