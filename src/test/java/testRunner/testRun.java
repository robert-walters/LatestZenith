package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                //features = ".//Features/Sprint40",
                //glue = "stepDefinitions",
                features = ".//Features/Automation",
                glue = "StepDefinitions",
                dryRun = false,
                monochrome = true,
                plugin = {"pretty","html:test-output.html"},
                tags = "@test"
        )
class TestRun {
}


