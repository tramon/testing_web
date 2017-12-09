package testing_web.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testing_web.utils.page_object.PageObject;
import javax.inject.Inject;

public class GoogleCalcPage extends PageObject {


    private final String XPATH_TO_CALC_BUTTON = "//span[@class='cwbts'][text()[contains(.,'%s')]]";

    @FindBy(id = "cnt")
    private WebElement content;

    @FindBy(id = "cwmcwd")
    private WebElement calcContainer;

    @FindBy(id = "cwos")
    private WebElement inputValueSpan;

    @FindBy(id = "cwfleb")
    private WebElement resultString;

    @FindBy(xpath = "//span[@class='cwbts'][.='=']")
    private WebElement equalsButton;

    @Inject
    public GoogleCalcPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void waitForLoading(){
        WebDriverWait wait = new WebDriverWait(webDriver, 30);
        wait.until(ExpectedConditions.visibilityOf(calcContainer));
    }


    public WebElement getCalcButtonByText(String text){
        String xpath = String.format(XPATH_TO_CALC_BUTTON, text);
        return webDriver.findElement(By.xpath(xpath));
    }

    public WebElement getContent() {
        return content;
    }

    public WebElement getCalcContainer() {
        return calcContainer;
    }

    public WebElement getInputValueSpan() {
        WebDriverWait wait = new WebDriverWait(webDriver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cwos")));
        return inputValueSpan;
    }

    public WebElement getResultString() {
        return resultString;
    }

    public WebElement getEqualsButton() {
        return equalsButton;
    }
}
