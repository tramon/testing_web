package testing_web.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testing_web.utils.page_object.PageObject;
import javax.inject.Inject;


public class GooglePage extends PageObject {

    @FindBy(id = "lst-ib")
    private WebElement googleInput;

    @FindBy(id = "viewport")
    private WebElement container;

    @Inject
    public GooglePage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getGoogleInput() {
        return googleInput;
    }

    public WebElement getContainer() {
        return container;
    }

}
