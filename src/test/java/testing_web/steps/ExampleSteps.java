package testing_web.steps;

import javax.inject.Inject;

import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import testing_web.ui.pages.GooglePage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class ExampleSteps {

    @Inject
    private WebDriver webDriver;

    @Inject
    private GooglePage googlePage;

    @Given("^I open \"([^\"]*)\" page$")
    public void i_open_google_page(String url) {
        webDriver.navigate().to(url);
    }

    @When("^In google page I search for \"([^\"]*)\"$")
    public void i_search_for(String text){
        googlePage.getGoogleInput().clear();
        googlePage.getGoogleInput().sendKeys(text);
        googlePage.getGoogleInput().sendKeys(Keys.ENTER);
    }


    @Then("^I should have google calc page opened$")
    public void i_google_should_show_me_results() {
        System.out.println("Mock here for now");
    }
}