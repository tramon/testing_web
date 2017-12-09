package testing_web.steps.google_calc;

import org.openqa.selenium.WebDriver;
import testing_web.ui.pages.GoogleCalcPage;

import javax.inject.Inject;


public class GoogleCalcStates {

    @Inject
    private GoogleCalcPage googleCalcPage;

    @Inject
    private WebDriver webDriver;

    public String getInputValue(){
        return googleCalcPage.getInputValueSpan().getText();
    }

    public boolean isGoogleCalcPageDisplayed(){
        return googleCalcPage.getCalcContainer().isDisplayed();
    }

}