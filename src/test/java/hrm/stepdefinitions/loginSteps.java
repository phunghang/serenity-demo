package hrm.stepdefinitions;

import common.OpenPage;
import hrm.screenplay.pages.DashboardPage;
import hrm.screenplay.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.junit.Assert;


public class loginSteps {

    Actor staff = Actor.named("Nhân viên");

    @Steps
    LoginPage loginPage;
    @Steps
    DashboardPage dashboardPage;

    @When("Truy cập trang {string}")
    public void openPage(String page) {
        staff.attemptsTo(OpenPage.toPage(page));

//        staff.attemptsTo(Open.url("https://serenity-bdd.github.io/docs/reporting/the_serenity_reports"));

    }

    @And("Đăng nhập vào hệ thống bằng tài khoản {string}, mật khẩu {string}")
    public void loginWithUsernameAndPassword(String username, String pass) {
        staff.attemptsTo(
                Enter.theValue(username).into(loginPage.TXT_USERNAME),
                Enter.theValue(pass).into(loginPage.TXT_PASSWORD),
                Click.on(loginPage.BT_LOGIN)
        );
    }

    @Then("Đăng nhập thành công, hiển thị trang Dashboard")
    public void checkLoginSuccess() {
        Assert.assertEquals("Dashboard", dashboardPage.HEADER.getText());
    }

    @Then("Đăng nhập không thành công, hiển thị thông báo lỗi {string}")
    public void validateLogin(String msg) {
        Assert.assertTrue("Lỗi hiển thị không chính xác", loginPage.ALERT_ERROR.getText().contains(msg));
    }

    @Given("Tồn tại tài khoản với username {string} và mật khẩu {string}")
    public void prepareAccount(String username, String pass) {
        // chuẩn bị thủ công
    }
}
