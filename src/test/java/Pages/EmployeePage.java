package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeePage extends BasePage {

    public EmployeePage (WebDriver givenDriver) {

        super(givenDriver);
    }

    @FindBy(css = ".orangehrm-horizontal-padding.orangehrm-vertical-padding > .oxd-text.oxd-text--span")

    private WebElement employeeRecords;


    @FindBy(css = (".oxd-main-menu > li:nth-of-type(2)"))

    private WebElement pimBtn;

@FindBy (css = "div[role='table'] > div:nth-of-type(1) > div[role='row'] > div:nth-of-type(2)")
private WebElement idField;

@FindBy (css = "div[role='table'] > div:nth-of-type(1) > div[role='row'] > div:nth-of-type(3)")

private WebElement firstName;

 @FindBy (css = "div[role='table'] > div:nth-of-type(1) > div[role='row'] > div:nth-of-type(4)")

 private WebElement lastName;

@FindBy (css = "div[role='table'] > div:nth-of-type(1) > div[role='row'] > div:nth-of-type(5)")
private WebElement jobTitleField;







    public EmployeePage clickOnPimBtn(){

        pimBtn.click();
        return  this ;

    }

    public boolean isEmployeeRecordsDisplayed(){

        return employeeRecords.isDisplayed();
    }


    public boolean isIdDisplayed(){
        return idField.isDisplayed();
    }

    public boolean isFirstNameDisplayed(){

        return firstName.isDisplayed();
    }

    public boolean isLastNameDisplayed(){

        return lastName.isDisplayed();
    }
    public boolean isJobTitleDisplayed(){

        return jobTitleField.isDisplayed();
    }







}