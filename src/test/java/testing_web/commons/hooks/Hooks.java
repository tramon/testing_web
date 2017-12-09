package testing_web.commons.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import javax.inject.Inject;
import java.util.concurrent.TimeUnit;

import static testing_web.commons.view.console.ConsoleViewer.printResult;
import static testing_web.commons.constants.ProjectTimeouts.IMPLICIT_TIMEOUT;


public class Hooks {

    private static boolean done = false;

    @Inject
    private WebDriver driver;

    @Before
    public void openWebSite() {
        if (!done) {
            Runtime.getRuntime().addShutdownHook(new Thread(() -> driver.close()));
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
            done = true;
        }

    }

    @After
    public void closeSession(Scenario scenario) {
        printResult(scenario);
    }


}
