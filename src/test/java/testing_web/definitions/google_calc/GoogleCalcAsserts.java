package testing_web.definitions.google_calc;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import testing_web.steps.google_calc.GoogleCalcStates;
import javax.inject.Inject;


public class GoogleCalcAsserts {

    @Inject
    private GoogleCalcStates googleCalcStates;


    @Then("^Google calc page should be opened$")
    public void google_calc_page_is_loaded() {
        Assert.assertTrue("This is not an expected page",
                googleCalcStates.isGoogleCalcPageDisplayed());
    }

    @Then("^Check that google calc input is '([^\"]*)'$")
    public void then_google_calc_form_is_loaded(String input) {
        String actualValue = googleCalcStates.getInputValue();
        Assert.assertTrue("Input is invalid. Expected: " + input + " Actual: " + actualValue,
                input.equals(actualValue));
    }


}
