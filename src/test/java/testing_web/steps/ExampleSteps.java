package testing_web.steps;

import javax.inject.Inject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testing_web.ui.pages.GooglePage;



public class ExampleSteps {

    @Inject
    private WebDriver webDriver;

    @Inject
    private GooglePage googlePage;

    private String pageTitle = "";


    @Given("^I open \"([^\"]*)\" page$")
    public void i_open_google_page(String url) {
        webDriver.navigate().to(url);
    }

    @When("^In google page I search for \"([^\"]*)\"$")
    public void i_search_for(String text){
        pageTitle = text;
        googlePage.getGoogleInput().clear();
        googlePage.getGoogleInput().sendKeys(text);
        googlePage.getGoogleInput().sendKeys(Keys.ENTER);
    }


    @Then("^I should have google calc page opened$")
    public void i_google_should_show_me_results() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.titleContains(pageTitle));
        Assert.assertTrue("This is not an expected page",
                webDriver.getTitle().contains(pageTitle));

    }
}