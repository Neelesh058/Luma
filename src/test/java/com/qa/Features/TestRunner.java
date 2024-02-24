package com.qa.Features;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="Features/Login.feature",
        glue={"StepDefinition"},
        tags="@Part2"
//        dryRun = true

)
public class TestRunner {



}
