import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/Search.feature", glue = "steps")
public class RunCukesTest extends AbstractTestNGCucumberTests{

}
