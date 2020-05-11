package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // to built cucmber report in json file
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        // where my feature file is located
        features = "src/test/resources/features/",

        glue = "com/vytrack/step_definitions",

        dryRun = false,
        tags = "@login"

)
public class CukesRunner {


}


