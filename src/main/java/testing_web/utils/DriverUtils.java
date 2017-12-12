package testing_web.utils;


import org.openqa.selenium.WebDriver;


public final class DriverUtils {

    private static String BASE_WINDOW = "";

    public static void switchToNextWindow(WebDriver webDriver) {
        String currentWindowHandle = webDriver.getWindowHandle();
        if (!currentWindowHandle.equalsIgnoreCase(BASE_WINDOW)) {
            BASE_WINDOW = currentWindowHandle;
        }

        webDriver.getWindowHandles().forEach( (s) -> {
            if (!BASE_WINDOW.equals(s)) {
                webDriver.switchTo().window(s);
            }
        });
    }

    public static void switchToDefaultWindow(WebDriver driver) {
        driver.switchTo().window(BASE_WINDOW);
    }

}
