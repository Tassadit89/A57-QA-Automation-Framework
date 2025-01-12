package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeePage extends BasePage {

    public EmployeePage(WebDriver givenDriver) {

        super(givenDriver);
    }

    @FindBy(css = ".orangehrm-horizontal-padding.orangehrm-vertical-padding > .oxd-text.oxd-text--span")

    private WebElement employeeRecords;


    @FindBy(css = (".oxd-main-menu > li:nth-of-type(2)"))

    private WebElement pimBtn;





    public EmployeePage clickOnPimBtn(){

        pimBtn.click();
        return  this ;

    }

    public boolean isEmployeeRecordsDisplayed(){

        return employeeRecords.isDisplayed();
    }








}