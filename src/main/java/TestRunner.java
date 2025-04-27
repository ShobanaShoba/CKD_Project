
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/features",
    glue = "stepDefinitions", // This should be the package where your step definitions are located
    plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class TestRunner {
}