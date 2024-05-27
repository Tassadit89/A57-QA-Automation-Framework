package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver givenDriver){
        super(givenDriver);
    }
   By emailField = By.cssSelector("input[type='email']");
    By passwordField = By.cssSelector("input[type='password']");
    By submitBtn= By.cssSelector("input[type='email']");

    public void provideEmail (String email ) {
        findElement(emailField).sendKeys();

    }

    public void providePassword(String password ){
        findElement(passwordField).sendKeys();
    }

    public void clickSubmit(){
        findElement(submitBtn).click();
    }










}

