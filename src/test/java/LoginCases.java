import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginCases extends BaseTest {

    @Test

    public void loginWithCorrectCredentials(){

        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2026@").clickSubmit();


    }


}
