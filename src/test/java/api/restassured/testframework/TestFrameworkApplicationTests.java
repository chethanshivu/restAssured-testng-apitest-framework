package api.restassured.testframework;


import groovy.util.logging.Slf4j;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.DataProvider;



@SpringBootTest
@Slf4j
@CucumberOptions(features = "src/test/resources/features",
        glue = {"stepdefinitions"},
        tags = "@Regression",
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json",
                "testng:target/cucumber-reports/cucumber.xml"})
class TestFrameworkApplicationTests extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }

}
