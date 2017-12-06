package testing_web.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testing_web.utils.page_object.PageObject;



public class GooglePage extends PageObject {

    @FindBy(id = "lst-ib")
    private WebElement googleInput;

    @FindBy(id = "viewport")
    private WebElement container;

    public WebElement getGoogleInput() {
//        return googleInput;
        return webDriver.findElement(By.id("lst-ib"));
    }

    public WebElement getContainer() {
//        return container;
        return webDriver.findElement(By.id("viewport"));
    }


}
