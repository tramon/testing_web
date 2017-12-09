package testing_web.definitions.google;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import testing_web.steps.google.GoogleActions;
import testing_web.ui.pages.GooglePage;

import javax.inject.Inject;

public class GoogleDefinitions {

    @Inject
    private WebDriver driver;

    @Inject
    private GooglePage googlePage;

    @Inject
    private GoogleActions googleActions;

    private String pageTitle = "";

    @Given("^I open '([^\"]*)' page$")
    public void i_open_google_page(String searchQuery) {
        googleActions.openBaseUrl();
//        driver.get(searchQuery);
    }

    @When("^In google page I search for '([^\"]*)'$")
    public void i_search_for(String searchQuery){
        googleActions.searchInGoogle(searchQuery);
    }


}
