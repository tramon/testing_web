package testing_web.definitions.google_calc;


import cucumber.api.java.en.When;
import testing_web.steps.google_calc.GoogleCalcActions;
import testing_web.ui.pages.GoogleCalcPage;
import javax.inject.Inject;

public class GoogleCalcDefinitions {


    @Inject
    private GoogleCalcPage googleCalcPage;
    @Inject
    private GoogleCalcActions googleCalcActions;

    @When("^I enter '([^\"]*)' to google calc input$")
    public void click_the_button(String button) {
        googleCalcActions.clickButton(button);
    }


}
