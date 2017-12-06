package testing_web.acceptancetests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
/*@CucumberOptions(
        glue = {"testing_web"},
        features = ".",
//        format = {"pretty", "json:target/cucumber-reports/cucumber.json"},
        format = {"pretty", "html:target/site/"},
        tags = {"@complete"}
)*/

@CucumberOptions(
        plugin =
//                {"pretty", "html:target/cucumberHtmlReport"},
        {"html:target/cucumberHtmlReport"},     //  for html result
//        {pretty:target/cucumber-json-report.json},  // for json result
        features = "classpath:features",
//        glue = {"info.seleniumcucumber.stepdefinitions",   // predefined step definitions package
//                "info.seleniumcucumber.userStepDefintions" // user step definitions package

        glue = {"testing_web"}
)

public class AllTests {
}