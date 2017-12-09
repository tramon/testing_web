package testing_web.steps.google;


import org.openqa.selenium.WebElement;
import testing_web.ui.pages.GooglePage;
import javax.inject.Inject;


public class GoogleStates {


    @Inject
    private GooglePage googlePage;


    public WebElement getGoogleInput() {
        return googlePage.getGoogleInput();
    }


}