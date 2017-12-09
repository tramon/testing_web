package testing_web.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testing_web.utils.page_object.PageObject;
import javax.inject.Inject;


public class GooglePage extends PageObject {

    @FindBy(id = "lst-ib")
    private WebElement googleInput;

    @FindBy(id = "main")
    private WebElement container;

    @Inject
    public GooglePage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getGoogleInput() {
        return googleInput;
    }

    public void waitForLoading() {
        WebDriverWait wait = new WebDriverWait(webDriver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("main")));
    }

}
