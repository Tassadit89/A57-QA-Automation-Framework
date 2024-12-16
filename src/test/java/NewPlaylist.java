import Pages.BasePage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewPlaylist extends BaseTest {

    @Test

    public void createNewPlaylistWithCorrectRequirements(){

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        BasePage basePage = new BasePage(getDriver());

        String playListCreationSuccessMsg ="Created playlist \"New playlist.\"";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2025@").clickSubmit();
        homePage.clickTheCreatePlaylistBtn().selectNewPlaylist().providePlaylistName("New playlist");
        Assert.assertEquals(homePage.getPlaylistCreationSuccessMsg(),playListCreationSuccessMsg);


    }



    @Test

    public void createDuplicatePlaylist(){

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        BasePage basePage = new BasePage(getDriver());

        String playListCreationSuccessMsg ="Created playlist \"New playlist.\"";

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Password2025@").clickSubmit();
        homePage.clickTheCreatePlaylistBtn().selectNewPlaylist().providePlaylistName("New playlist");
        Assert.assertEquals(homePage.getPlaylistCreationSuccessMsg(),playListCreationSuccessMsg);






    }
