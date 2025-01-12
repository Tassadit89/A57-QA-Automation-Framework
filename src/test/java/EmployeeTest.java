
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class EmployeeTest extends BaseTest {


    @Test

    public void VerifyEmployeeListIsAccessibleViaPimSection() {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String employeeRecords = "(98) Records Found";

        loginPage.p

    }


}