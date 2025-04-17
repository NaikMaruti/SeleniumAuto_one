package Hooks;


import Base.initializeDriver;
import io.cucumber.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Scenario;


public class Hooks extends initializeDriver {



    @After (order = 0)
    public static void tearDown(){
        //System.out.println("close the browser");
        WebDriver d= initializeDriver.driver;
       d.quit();

    }

    @After (order = 1)
    public void imageReport(Scenario sc) {
        WebDriver d= initializeDriver.driver;
        if (sc.isFailed()){
            TakesScreenshot ts = (TakesScreenshot) d;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            sc.attach(screenshot, "image/png", sc.getName());
        }
        else {
//            TakesScreenshot ts = (TakesScreenshot) d;
//            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
//            sc.attach(screenshot, "image/png", sc.getName());
        }
    }
}
