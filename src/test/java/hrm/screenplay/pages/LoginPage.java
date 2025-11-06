package hrm.screenplay.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.WhenPageOpens;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@DefaultUrl("/auth/login")
public class LoginPage extends PageObject {


    @WhenPageOpens
    void waitUtilPageLoaded() {
        this.waitFor(ExpectedConditions.elementToBeClickable(By.cssSelector(".orangehrm-login-button")));
    }

    @FindBy(css = ".orangehrm-login-button")
    public WebElementFacade BT_LOGIN;

    @FindBy(name = "username")
    public WebElementFacade TXT_USERNAME;

    @FindBy(name = "password")
    public WebElementFacade TXT_PASSWORD;

    @FindBy(css = ".oxd-alert-content--error")
    public WebElementFacade ALERT_ERROR;

}
