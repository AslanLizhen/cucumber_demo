package com.softwaretest.automation.lizhen.cuke;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.softwaretest.automation.lizhen.steps",
        tags = {"~@ignore", "~@manual"},
        features = {
                "src/test/resources/features/cucumber2020/demo_1.feature",

        }
)
public class SanityTest {
}
