
import Pages.EmployeePage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeTest extends BaseTest {


    @Test

    public void VerifyEmployeeListIsAccessibleViaPimSection() {// passed

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        EmployeePage employeePage = new EmployeePage(getDriver());
        String employeeRecords = "(98) Records Found";

        loginPage.provideUserName("Admin").provideOrangePassword("admin123").clickOnSubmitBtn();
        homePage.clickOnPimBtn();
        Assert.assertTrue(employeePage.isEmployeeRecordsDisplayed(),employeeRecords);


    }


    @Test

    public void verifyEmployeesAreListedByTheirId(){ // Passed
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        EmployeePage employeePage = new EmployeePage(getDriver());
        String id = "Id\n";

        loginPage.provideUserName("Admin").provideOrangePassword("admin123").clickOnSubmitBtn();
        homePage.clickOnPimBtn();
        Assert.assertTrue(employeePage.isIdDisplayed(),id);

    }



    @Test

    public void verifyEmployeesAreListedByTheirFirstName(){ //Passed
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        EmployeePage employeePage = new EmployeePage(getDriver());
        String FirstName = "\n" +
                "First (& Middle) Name\n";

        loginPage.provideUserName("Admin").provideOrangePassword("admin123").clickOnSubmitBtn();
        homePage.clickOnPimBtn();
        Assert.assertTrue(employeePage.isFirstNameDisplayed(),FirstName);

    }

    @Test

    public void verifyEmployeesAreListedByTheirLastName() { //Passed
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        EmployeePage employeePage = new EmployeePage(getDriver());
        String LastName = "\n" +
                "Last Name\n";

        loginPage.provideUserName("Admin").provideOrangePassword("admin123").clickOnSubmitBtn();
        homePage.clickOnPimBtn();
        Assert.assertTrue(employeePage.isLastNameDisplayed(), LastName);


    }
@Test
    public void verifyEmployeesAreListedByTheirJobTitle() { //Passed
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        EmployeePage employeePage = new EmployeePage(getDriver());
        String jobTitle = "\n" +
                "Job Title\n";
        loginPage.provideUserName("Admin").provideOrangePassword("admin123").clickOnSubmitBtn();
        homePage.clickOnPimBtn();
        Assert.assertTrue(employeePage.isJobTitleDisplayed(), jobTitle);


    }

}