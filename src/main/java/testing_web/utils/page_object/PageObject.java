package testing_web.utils.page_object;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class PageObject {

    protected WebDriver webDriver;

    public PageObject(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);

    }

    public static void setCheckBox(WebElement element, Boolean toCheck){
        if(element.isEnabled() != toCheck){
            element.click();
        }
    }


}
