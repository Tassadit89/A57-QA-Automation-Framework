import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProfilePage;
import org.testng.annotations.Test;

public class ProfileTests extends BaseTest{

    @Test

public void changeProfileName(){

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homepage =new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2026@").clickSubmit();
        homepage.getAvatarIcon();
        profilePage.provideCurrentPassword().provideProfileName();








}
}
