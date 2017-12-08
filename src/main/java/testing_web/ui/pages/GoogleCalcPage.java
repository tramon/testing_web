package testing_web.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testing_web.utils.page_object.PageObject;

import javax.inject.Inject;

public class GoogleCalcPage extends PageObject {


    @FindBy()
    private WebElement element;


    @Inject
    public GoogleCalcPage(WebDriver webDriver) {
        super(webDriver);
    }



}
