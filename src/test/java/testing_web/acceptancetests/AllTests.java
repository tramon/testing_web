package testing_web.acceptancetests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"testing_web"},
        features = ".",
//        format = {"pretty", "json:target/cucumber-reports/cucumber.json"},
        format = {"pretty", "html:target/site/"},
        tags = {"@complete"}
)
public class AllTests {
}