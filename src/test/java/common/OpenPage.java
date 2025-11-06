package common;

import hrm.screenplay.pages.EmployeeListPage;
import hrm.screenplay.pages.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPage implements Task {
    String page;

    OpenPage(String page) {
        this.page = page;
    }

    public static OpenPage toPage(String page) {
        return instrumented(OpenPage.class, page);
    }


    @Override
    public <T extends Actor> void performAs(T t) {
        switch (page.toLowerCase()) {
            case "login":
                LoginPage loginPage = new LoginPage();
                loginPage.open();
                break;
            case "danh sách nhân viên":
                EmployeeListPage employeeListPage = new EmployeeListPage();
                employeeListPage.open();
                break;
            default:
                throw new RuntimeException("Không có trang " + page);
        }


    }
}
