package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/functionalTestCases",
        glue = {"stepDefinitions"},
        tags = "@regression",
        monochrome = true
)
public class TestRunner {
}
