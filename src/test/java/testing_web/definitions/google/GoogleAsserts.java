package testing_web.definitions.google;


import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testing_web.commons.constants.ProjectTimeouts;
import testing_web.ui.pages.GooglePage;
import javax.inject.Inject;


public class GoogleAsserts {

    @Inject
    private WebDriver driver;

    @Inject
    private GooglePage googlePage;

    private String pageTitle = "";


    @Then("^I should have google page opened$")
    public void i_google_should_show_me_results() {
        WebDriverWait wait = new WebDriverWait(driver, ProjectTimeouts.BASE_TIMEOUT);
        wait.until(ExpectedConditions.titleContains(pageTitle));
        Assert.assertTrue("This is not an expected page",
                driver.getTitle().contains(pageTitle));

    }
}
