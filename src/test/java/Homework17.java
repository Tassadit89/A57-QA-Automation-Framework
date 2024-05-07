
import org.apache.commons.lang3.exception.UncheckedInterruptedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import org.testng.annotations.Test;

public class Homework17 extends BaseTest{
    @Test


    public void addSongToPlaylist() throws InterruptedException{
        String url = "https://qa.koel.app/";
        String expectedSongAddedMsg = "Added 1 song into \" my playlist .\"";
        String namePlaylist = "my playlist";



        provideEmail("tassadit.talbi@testpro.io");
        providePassword("Password2026@");
        clickLoginBtn();
        Thread.sleep (2000);
        //Assert.assertEquals(driver.getCurrentUrl(), url); //https://qa.koel.app/
        //Thread.sleep (2000);
        searchSong ("Pluto");
        Thread.sleep (2000);
        clickViewALLBtn();
        Thread.sleep (2000);
        selectFirstSongResult();
        Thread.sleep (2000);
        clickAddToBtn();
        Thread.sleep (2000);
        choosePlaylist(namePlaylist);
        Thread.sleep (2000);

        Assert.assertEquals(getAddToPlaylistSuccessMsg(),expectedSongAddedMsg);




    }



    public String   getAddToPlaylistSuccessMsg() {
        WebElement notification = driver.findElement(By.xpath("//div[@class= 'success show']"));
        return notification.getText();


    }

    public void choosePlaylist (String playlistName) {
            WebElement playlist = driver.findElement (By.xpath( "//section[@id='songResultsWrapper']//li[contains (text(),'My Playlist')]"));
            playlist.click();
        }

        public void clickAddToBtn () {
            WebElement AddToBtn = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//button[@data-test='add-to-btn']"));
            AddToBtn.click();

        }

        public void selectFirstSongResult () {
            WebElement FirstSongInResult = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//tr[@class='song-item'][1]"));
            FirstSongInResult.click();
        }

        public void clickViewALLBtn () {
            WebElement viewAllBtn = driver.findElement(By.xpath("//button[@data-test='view-all-songs-btn']"));
            viewAllBtn.click();
        }

        public void searchSong(String songName ) {
            WebElement searchField = driver.findElement(By.cssSelector("div#searchForm input[type='search']"));
            searchField.clear();
            searchField.sendKeys(songName);
        }


    }













