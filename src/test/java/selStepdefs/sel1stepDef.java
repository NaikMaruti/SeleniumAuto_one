package selStepdefs;

import Base.initializeDriver;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjs.signinPage;

public class sel1stepDef extends initializeDriver {
   WebDriver  driver = initializeDriver.initDriver();
    signinPage sp = new signinPage(driver);



    @Given("User to navigate to {string}")
    public void user_to_navigate_to(String url) {
        driver.get(url);
    }

    @When("User enters credentials {string} {string}")
    public void user_enters_credentials(String UserName, String Password) {
        sp.enterInput(UserName);
        sp.enterpwd(Password);
    }

    @When("user click on signin")
    public void user_click_on_signin() {
        sp.clickSignin();
    }

    @Then("user to validate the error message {string}")
    public void user_to_validate_the_error_message(String error) {
        String msg = sp.getErrormsg();
        System.out.println("actual error message is ->"+ msg);
        if(msg.equalsIgnoreCase(error)){
            System.out.println("Error message is displaying as expected");
        }else{
            Assert.assertEquals(msg, error);
        }

    }





}
