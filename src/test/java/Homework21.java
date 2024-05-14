import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


public class Homework21 extends BaseTest{



    public void renamePlaylist(){

        String playlistName= "My Playlist";
        String expectedUpdateMsg = "Updated playlist 'My Zik'";

        provideEmail("tassadit.talbi@testpro.io");
        providePassword("Password2026@");
        clickLoginBtn();
        contextClickPlaylist();
        ChooseEditBtn();
        providePlaylistName();
        Assert.assertEquals();




    }

    public void providePlaylistName() {
        WebElement playlistField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@id='playlists']/ul//a[@href='#!/playlist/94449']")));
        playlistField.clear();
        playlistField.sendKeys("My Zik" );



    }

    private void ChooseEditBtn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@id='playlists']//nav[@class='menu playlist-item-menu']/ul/li[.='Edit']"))).click();




    }


    public void contextClickPlaylist() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@id='playlists']/ul/li[5]")));
        WebElement playlistElement  = driver.findElement(By.xpath("//section[@id='playlists']/ul/li[5]"));
        actions.contextClick(playlistElement).perform();


    }


}
