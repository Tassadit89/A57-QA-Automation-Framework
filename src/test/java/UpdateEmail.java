import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateEmail extends BaseTest{


    @Test


public void updateEmailWithCorrectAcceptanceCriteria(){

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());

        String successMsg = "Profile Updated.";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        homePage.clickOnViewProfile();
        profilePage.provideCurrentPassword("Passwordtest2025@").provideNewEmail("tassadit.test@testpro.io").clickSaveBtn();
        profilePage.getUpdatedProfileMsg();

            Assert.assertEquals(profilePage.getUpdatedProfileMsg(), successMsg);

}

@Test

public void updateEmailWithoutAPoint(){

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());
        String successMsg = "Profile Updated.";

        loginPage.provideEmail("tassadit.test@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        homePage.clickOnViewProfile();
        profilePage.provideCurrentPassword("Passwordtest2025@").provideNewEmail("tassadittest@testpro.io").clickSaveBtn();
        profilePage.getUpdatedProfileMsg();

        Assert.assertFalse(profilePage.getUpdatedProfileNotif(),successMsg);

}


@Test

 public void updateEmailWithoutAtSymbol(){ //unable to find the error message webelement

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());
        String successMsg = "Profile Updated.";

        loginPage.provideEmail("tassadit.test@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        homePage.clickOnViewProfile();
        profilePage.provideCurrentPassword("Passwordtest2025@").provideNewEmail("tassadit.adamtestpro.io").clickSaveBtn();
        profilePage.getUpdatedProfileMsg();

        Assert.assertFalse(profilePage.getUpdatedProfileNotif(),successMsg);



}

@Test

    public void updateEmailWithoutADomain (){

    LoginPage loginPage = new LoginPage(getDriver());
    HomePage homePage = new HomePage(getDriver());
    ProfilePage profilePage = new ProfilePage(getDriver());
    String successMsg = "Profile Updated.";

    loginPage.provideEmail("tassadit.test@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
    homePage.clickOnViewProfile();
    profilePage.provideCurrentPassword("Passwordtest2025@").provideNewEmail("tassadit.adamtestpro.io").clickSaveBtn();
    profilePage.getUpdatedProfileMsg();

    Assert.assertFalse(profilePage.getUpdatedProfileNotif(),successMsg);




}

}
