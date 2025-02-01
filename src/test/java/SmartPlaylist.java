import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmartPlaylist extends BaseTest{



    @Test
    public void createSmartPlaylistWithOneRule(){

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String successMsg ="Created playlist \"Student playlist.\"";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        homePage.clickOnCreatePlaylistBtn().clickOnCreatePlaylistDropD();
        homePage.writeSmartPlaylistName("Student playlist").selectTitleFromDropDown();
        homePage.selectIsFromSecondDropDown();
        homePage.writeTheSongName("Dark Days").clickOnSaveBtn();
        Assert.assertEquals(homePage.getSuccessNotification(),successMsg);

    }
@Test

public void verifySmartPlaylistWithOneRulRelatedSongsAppear(){
    LoginPage loginPage = new LoginPage(getDriver());
    HomePage homePage = new HomePage(getDriver());
    loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
    homePage.clickOnSmartPlaylist();
    Assert.assertTrue(homePage.isDarkDaysDisplayed());
}








}
