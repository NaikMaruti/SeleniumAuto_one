package Runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/marut/IdeaProjects/Automati_1/src/test/java/selFeatures",
        glue={"selStepdefs", "Hooks"},monochrome = true, tags = "@mrt",
        plugin = {"pretty",
                "html:target/reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

}
)
public class runJuni {
}
