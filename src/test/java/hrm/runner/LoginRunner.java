package hrm.runner;

// Import cần thiết cho JUnit 4 và Serenity
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity; // <--- RẤT QUAN TRỌNG

@RunWith(CucumberWithSerenity.class) // SỬ DỤNG SERENITY RUNNER
@CucumberOptions(
        // Sử dụng CÚ PHÁP CỦA CUCUMBER OPTIONS
        features = "src/test/resources/features/login/login.feature", // Đường dẫn đến file feature
        glue = {"common", "hook", "hrm"}, // Package chứa các Step Definitions và Hooks
        tags = "not @manual", // Bộ lọc tags
        plugin = {"pretty", "json:target/site/cucumber/getAbtCartRunner.json"}
)
public class LoginRunner {
}