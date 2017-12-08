package testing_web.steps;

import javax.inject.Inject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testing_web.constants.Constants;
import testing_web.constants.Timeouts;
import testing_web.ui.pages.GooglePage;


public class ExampleSteps {

    @Inject
    private WebDriver driver;

    @Inject
    private GooglePage googlePage;

    private String pageTitle = "";

    @Given("^I open '([^\"]*)' page$")
    public void i_open_google_page(String url) {
        driver.get(Constants.BASE_URL);
        driver.navigate().to(url);
    }

    @When("^In google page I search for '([^\"]*)'$")
    public void i_search_for(String text){
        pageTitle = text;
        googlePage.getGoogleInput().clear();
        googlePage.getGoogleInput().sendKeys(text);
        googlePage.getGoogleInput().sendKeys(Keys.ENTER);
    }

    @Then("^I should have google calc page opened$")
    public void i_google_should_show_me_results() {
        WebDriverWait wait = new WebDriverWait(driver, Timeouts.BASE_TIMEOUT);
        wait.until(ExpectedConditions.titleContains(pageTitle));
        Assert.assertTrue("This is not an expected page",
                driver.getTitle().contains(pageTitle));

    }


}