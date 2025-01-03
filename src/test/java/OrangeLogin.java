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
}
