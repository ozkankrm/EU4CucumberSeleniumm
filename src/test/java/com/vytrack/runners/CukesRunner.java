package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber.json",          //for report
                   "html:target/default-html-reports", // for html report
                    "rerun:target/rerun.txt"},  // for remember which test case fail
        //features file in path ini yazdık
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",  // glue java package den altından başlıyor//stepdefinition path
        dryRun = false, //true sadece undefined stepsi getirir  //false ise normal hepsini çalıştırır.
        tags = "@wip"

)
public class CukesRunner {


}
