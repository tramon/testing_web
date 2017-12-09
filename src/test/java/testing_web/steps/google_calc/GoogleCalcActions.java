package testing_web.steps.google_calc;

import testing_web.ui.pages.GoogleCalcPage;

import javax.inject.Inject;


public class GoogleCalcActions {

    @Inject
    private GoogleCalcPage googleCalcPage;

    public void clickButton(String button) {
        googleCalcPage.waitForLoading();
        googleCalcPage.getCalcButtonByText(button).click();
    }
}