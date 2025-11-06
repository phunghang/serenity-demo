package hrm.screenplay.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/dashboard/index")
public class DashboardPage extends PageObject {

    @FindBy(css = ".oxd-topbar-header-title")
    public WebElementFacade HEADER;


}
