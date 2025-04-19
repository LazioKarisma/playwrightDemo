
package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "stepDefinitions",
        dryRun = false,
        features = "src/test/scenarios/",
        tags = "@GetAPI",
        plugin = {
                "json:target/cucumber-result/json/GetApiRunner.json"
        }
)
public class ApiGetRunner {

}
