//import Base.initializeDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//
//public class selIntro extends initializeDriver {
//
//
//     static WebDriver driver = initializeDriver.initDriver();
//
//
//
//    public static void main(String[] args) throws InterruptedException {
//
//        driver.get("https://rahulshettyacademy.com/locatorspractice/");
//
//        System.out.println("Title is ----->"+ driver.getTitle());
//        System.out.println("URL is ----->" +driver.getCurrentUrl());
//
//        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
//
//        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
//
//        //driver.findElement(By.className("signInBtn")).click();
//
//        //System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//
//        //driver.findElement(By.linkText("Forgot your password?")).click();
//
//        //driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
//
//        //driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
//
//        //driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
//
//        //driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
//
//        //driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
//
//        Thread.sleep(3000);
//
//        //driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//
//       // System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//
//       // driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
//
//        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
//
//        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
//        Thread.sleep(3000);
//
//        //driver.findElement(By.id("chkboxOne")).click();
//        //driver.findElement(By.xpath("//label[text()=' Remember my username']")).click();
//
//        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
//
//
//       // initializeDriver.quitDriver(driver);
//
//
//    }
//}
