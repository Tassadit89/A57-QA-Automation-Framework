import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeLogin extends BaseTest{

    @Test

    public void loginWithValidCredentials(){

        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.provideUserName("Admin").provideOrangePassword("admin123").clickOnSubmitBtn();
        Assert.assertTrue(loginPage.isAvatarIconDisplayed());
    }


    @Test

    public void loginWithInvalidCredentials(){

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage= new HomePage(getDriver());

        loginPage.provideUserName("Admin").provideOrangePassword("admin12").clickOnSubmitBtn();
        Assert.assertTrue(loginPage.isLoginBtnEnabled());
    }

@Test
    public void verifyUserIsRedirectedToDashboardPageUponSuccessfulLogin(){

        LoginPage loginPage = new LoginPage(getDriver());
    HomePage homePage= new HomePage(getDriver());

        loginPage.provideUserName("Admin").provideOrangePassword("admin123").clickOnSubmitBtn();
        Assert.assertEquals(homePage.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }





}
