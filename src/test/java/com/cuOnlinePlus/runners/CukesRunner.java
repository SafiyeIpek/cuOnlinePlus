package com.cuOnlinePlus.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports"},
        features = "src/test/resources/features",
        glue = "com/cuOnlinePlus/step_definitions",
        strict = true,
        dryRun = false,
        tags = "@login"
)
public class CukesRunner {
}
