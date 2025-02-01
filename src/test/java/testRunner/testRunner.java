package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

      features = "Features/registration.feature",

        glue = {"stepDefinitions"},
        plugin = {"json:target/cucumber.json"},
        tags = {"@reg"},
        monochrome = true

)
public class testRunner {

}
