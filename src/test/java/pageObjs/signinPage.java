package pageObjs;

import Base.initializeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class signinPage extends initializeDriver {
    WebDriver driver ;


   @FindBy(xpath= "//input[@id='inputUsername']" )
   private WebElement InputUsername;

    public WebElement getInputUsername() {
        return InputUsername;
    }

    @FindBy(name = "inputPassword" )
    private WebElement InputPassword;

    public WebElement getInputPassword(){
        return InputPassword;
    }


    @FindBy(className = "signInBtn" )
    private WebElement SignInBtn;

    public WebElement getSignInBtn() {
        return SignInBtn;
    }

    @FindBy(xpath = "//p[@class='error']")
    private WebElement errmsg;

    public WebElement geterrmsg() {
        return errmsg;
    }

    @FindBy(linkText = "Forgot your password?")
    private WebElement Forgotpassword;

    public WebElement getForgotpassword() {
        return Forgotpassword;
    }

    @FindBy(xpath = "//input[@placeholder='Name']" )
    private WebElement name;

    public WebElement getName() {
        return name;
    }

    @FindBy(xpath = "input[placeholder='Email']" )
    private WebElement email;

    public WebElement getEmail() {
        return email;
    }

    @FindBy(xpath = "//input[@type='text'][2]" )
    private WebElement text;

    public WebElement getText() {
        return text;
    }

    @FindBy(xpath = "input[type='text']:nth-child(3)" )
    private WebElement uname;

    public WebElement getUname() {
        return uname;
    }

    @FindBy(xpath = "//form/input[3]" )
    private WebElement pname;

    public WebElement getPname() {
        return pname;
    }

    @FindBy(xpath = "reset-pwd-btn" )
    private WebElement naresetbtn;

    public WebElement getNaresetbtn(){
        return naresetbtn;
    }

    @FindBy(xpath = "form p" )
    private WebElement gettname;

    public WebElement getGettname() {
        return gettname;
    }

    @FindBy(xpath = "//div[@class='forgot-pwd-btn-conainer']/button[1]" )
    private WebElement forgotpwd;

    public WebElement getForgotpwd() {
        return forgotpwd;
    }

    @FindBy(xpath = "//label[text()=' Remember my username']" )
    private WebElement remUname;

    public WebElement getRemUname() {
        return remUname;
    }

    @FindBy(xpath = "//button[contains(@class,'submit')]" )
    private WebElement submit;

    public WebElement getSubmit() {
        return submit;
    }

//    public signinPage(WebDriver driver) {
//        this.driver = driver;
//    }


    public signinPage( WebDriver driver ) {
        this.driver = driver;
        PageFactory.initElements( driver, this);
    }




    // Actions


    public void enterInput (String name){
       getInputUsername().sendKeys(name);
    }

    public void enterpwd (String pwd){
        getInputPassword().sendKeys(pwd);
    }

    public void clickSignin (){
        getSignInBtn().click();
    }

    public String getErrormsg(){
        return  geterrmsg().getText();
    }

    public void clickForgotpassword (){
        getForgotpassword().click();
    }

    public void entergetName (String name){
        getName().sendKeys(name);
    }

    public void entergetEmail (String email){
        getEmail().sendKeys(email);
    }

    public void cleargetText (){
        getText().clear();
    }

    public void entergetUname (String uname){
        getUname().sendKeys(uname);
    }

    public void entergetpname (String pname){
        getPname().sendKeys(pname);
    }

    public void clickgetNaresetbtn(){
        getNaresetbtn().click();
    }


    public void getGettnametext(){
        getGettname().getText();
    }

    public void clickgetForgotpwd(){
        getForgotpwd().click();
    }


    public void clickgetRemUname(){
        getRemUname().click();
    }

    public void clickgetSubmit(){
        getSubmit().click();
    }




}
