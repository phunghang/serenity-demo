package hrm.screenplay.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.WhenPageOpens;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@DefaultUrl("/pim/viewEmployeeList")
public class EmployeeListPage extends PageObject {
    @WhenPageOpens
    public void waitUntilPageLoaded() {
        this.waitFor(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".oxd-table-row")));
    }

    @FindBy(xpath = "//a[text() = 'Add Employee']")
    public WebElementFacade BT_ADD_NEW_EMPLOYEE;

    @FindBy(xpath = "//label[text()='Employee Name']/parent::div/following-sibling::div//input")
    public WebElementFacade TXT_EMPLOYEE_NAME;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElementFacade BT_SEARCH;
}
