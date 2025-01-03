package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    String Url ="https://qa.koel.app";

    @FindBy(css= "input[type='email']")
    private WebElement emailField;
    @FindBy(css ="input[type='password']")
    private WebElement  passwordField ;
    @FindBy(css = "button[type='submit']" )
    private WebElement submitBtn;





    public LoginPage(WebDriver givenDriver){

        super(givenDriver);
    }
   //By emailField = By.cssSelector("input[type='email']");
   // By passwordField = By.cssSelector("input[type='password']");
    //By submitBtn= By.cssSelector("input[type='email']");

    //public void provideEmail (String email ) {
        //emailField.sendKeys(email);
    //}
    //public void providePassword(String password ){
        //passwordField.sendKeys(password);
    //}
    //public void clickSubmit(){
        //submitBtn.click();
    //}

public LoginPage provideEmail(String email){
        emailField.sendKeys(email);
        return this;
}

public LoginPage providePassword (String password){
        passwordField.sendKeys(password);
        return this;

}

public LoginPage clickSubmit (){
        submitBtn.click();
        return this ;
}


    public LoginPage getCurrentUrl(String Url) {
        driver.get(Url);
        return this ;
        
    }

    //this code is for OrangeHR app/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy (css = "input[name='username']")

    private WebElement userNameField;


    @FindBy (css = "input[name='password']")

    private  WebElement passwrdField ;

    @FindBy (css = ".orangehrm-login-action.oxd-form-actions > .orangehrm-login-button.oxd-button.oxd-button--main.oxd-button--medium")

    private WebElement sbmtBtn;

@FindBy (css = ".oxd-userdropdown  img[alt='profile picture']")

    private WebElement avatarIcn;


public LoginPage provideUserName(String userName){
    userNameField.sendKeys(userName);
    return this ;
}

public LoginPage provideOrangePassword(String password){

    passwrdField.sendKeys(password);
    return this;


    }

    public boolean isAvatarIconDisplayed(){

    return avatarIcn.isDisplayed();
    }


    public LoginPage clickOnSubmitBtn(){

    sbmtBtn.click();
    return this;
    }






}

