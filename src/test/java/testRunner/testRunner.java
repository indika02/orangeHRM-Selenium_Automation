package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="Features/login.feature", //path of the feature file
        glue = "stepDefinitions",
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        monochrome = true,
        tags = "@test" //tags to run specific scenario
)
public class testRunner extends AbstractTestNGCucumberTests {
}
