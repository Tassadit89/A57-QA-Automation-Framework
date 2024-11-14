package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{

    public ProfilePage (WebDriver givenDriver){

        super (givenDriver);

    }

    @FindBy(css="input#inputProfileCurrentPassword")

   private WebElement currentPasswordField;

    @FindBy (css="input#inputProfileName")

    private WebElement profileNameField;

    @FindBy (css="button.btn-submit")
    private WebElement saveButton;



    public ProfilePage provideCurrentPassword (){
        currentPasswordField.clear();
        currentPasswordField.sendKeys();
        return this;

    }

    public ProfilePage provideProfileName(){
        profileNameField.clear();
        profileNameField.sendKeys();
        return  this;

    }

    public ProfilePage clickSaveBtn(){

        saveButton.click();
        return this;
    }














}
