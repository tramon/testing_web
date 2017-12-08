package testing_web.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

import javax.inject.Inject;

import java.util.concurrent.TimeUnit;

import static testing_web.constants.Timeouts.IMPLICIT_TIMEOUT;

public class Hooks {

    @Inject
    private WebDriver driver;

    @Before
    public void openWebSite() {
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
    }

    @After
    public void closeSession() {
        driver.close();
    }
}
