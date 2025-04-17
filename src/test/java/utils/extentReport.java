package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReport {
    public static ExtentReports getReportObject(){
        String path = System.getProperty("user.dir")+"//reports//index.html";

        ExtentSparkReporter reporter = new ExtentSparkReporter(path);

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Authour","Maruti Naik");
        return extent;
        }
    }

