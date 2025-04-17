package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
       plugin = { "pretty", "html:target/reports/cucumber.html"},
        features = "C:/Users/marut/IdeaProjects/Sel_Automati_1/src/test/java/selFeatures",
        //features = "C:/Users/marut/IdeaProjects/Automati_1/src/test/java/selFeatures",
        glue={"selStepdefs", "Hooks"},
        tags = "@mrt",
        dryRun = false,
        monochrome = true

)
public class runner extends AbstractTestNGCucumberTests{

}