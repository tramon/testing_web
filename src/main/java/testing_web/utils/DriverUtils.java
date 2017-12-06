package testing_web.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;

public class DriverUtils {
    public static long DEFAULT_WAIT = 30;
    protected static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver != null) {
            return driver;
        }
        System.setProperty("webdriver.chrome.driver", "drivers/windows/chromedriver.exe");
        DesiredCapabilities capabilities = null;
        capabilities = DesiredCapabilities.chrome();
        capabilities.setJavascriptEnabled(true);
        capabilities.setCapability("takesScreenshot", false);
        driver.manage().timeouts().setScriptTimeout(DEFAULT_WAIT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }


}
