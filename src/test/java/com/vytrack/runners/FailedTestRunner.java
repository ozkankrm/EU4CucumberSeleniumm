package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//how to run only fail test cases

//it is run only fail test cases

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/failed-html-report"},  // for html report
        features = "@target/rerun.txt", //path of fail test cases
        glue = "com/vytrack/step_definitions" // glue java package den altından başlıyor//stepdefinition path

)

public class FailedTestRunner {
}
