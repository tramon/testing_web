package testing_web.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GooglePage {

    @FindBy(id = "lst-ib")
    private WebElement googleInput;

    @FindBy(id = "viewport")
    private WebElement container;

    public WebElement getGoogleInput() {
        return googleInput;
    }

    public WebElement getContainer() {
        return container;
    }


}
