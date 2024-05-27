package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

    public HomePage (WebDriver givenDriver){
        super(givenDriver);


    }

    By userAvatarIcon = By.cssSelector("img.avatar");


    public WebElement getAvatarIcon  (){
        return findElement(userAvatarIcon);
    }
}
