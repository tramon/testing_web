package testing_web.steps.google;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import testing_web.commons.constants.Constants;
import testing_web.ui.pages.GooglePage;
import javax.inject.Inject;


public class GoogleActions {

    @Inject
    private WebDriver driver;

    @Inject
    private GooglePage googlePage;


    public void openBaseUrl(){
        driver.get(Constants.BASE_URL);
        googlePage.waitForLoading();
    }

    public void searchInGoogle(String searchQuery) {
        googlePage.getGoogleInput().clear();
        googlePage.getGoogleInput().sendKeys(searchQuery);
        googlePage.getGoogleInput().sendKeys(Keys.ENTER);
    }
}