package testing_web.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
//        plugin = {"html:target/cucumber-html-report"},     //  for html result
//                {"pretty", "html:target/cucumberHtmlReport"},
//        {pretty:target/cucumber-json-report.json},  // for json result
//        glue = {"info.seleniumcucumber.stepdefinitions",   // predefined step definitions package
//                "info.seleniumcucumber.userStepDefintions" // user step definitions package
//        dryRun = false,
//        strict = false,
        format = {"pretty", "html:target/cucumber-reports",
                "json:target/cucumber-reports/cucumber.json"},
        features = "classpath:features",
        glue = {"testing_web"},
        tags = {"@enabled"}
)
public class AllTests {


}