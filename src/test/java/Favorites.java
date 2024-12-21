import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Favorites extends BaseTest{


    @Test

    public void addSongsToFavorites(){

        String songCount = "2 songs.7:54.Downlaod All";

        LoginPage loginPage= new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        loginPage.provideEmail("tassadit.talbi@testpro.io").providePassword("Passwordtest2025@").clickSubmit();
        homePage.clickOnAllSongsBtn().clickHoliznaLikeBtn().clickRiquiLikeBtn().clickFavoritePlaylist();
        Assert.assertEquals(homePage.getSongCountText(),songCount);
    }


}
