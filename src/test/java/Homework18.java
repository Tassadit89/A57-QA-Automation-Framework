import org.openqa.selenium.By;
<<<<<<< HEAD
=======
import org.openqa.selenium.JavascriptExecutor;
>>>>>>> Homework-18
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest {

    @Test
    public void playSong () throws InterruptedException{
        String url= "https://qa.koel.app";
<<<<<<< HEAD
        navigateToPage();
        provideEmail("tassadit.talbi@testpro.io");
        providePassword("Password2026@");
        clickLoginBtn();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        Thread.sleep(2000);
        clickPlayNextSongBtn();
        Thread.sleep(2000);
        clickPlayBtn ();
=======

        provideEmail("tassadit.talbi@testpro.io");
        providePassword("Password2026@");
        clickLoginBtn();
        Thread.sleep(4000);
        //Assert.assertEquals(driver.getCurrentUrl(), url);
        //Thread.sleep(2000);
        iPushTheButtonPlay();
>>>>>>> Homework-18
        Thread.sleep(2000);
        Assert.assertTrue(isSongPlaying());








    }

<<<<<<< HEAD
    public void clickPlayBtn() {
        WebElement playBtn =driver.findElement(By.xpath("//i[@data-testid='play-next-btn']"));
        playBtn.click();
    }

    public void clickPlayNextSongBtn() {
        WebElement playNextSongBtn = driver.findElement(By.xpath("//span[@data-testid='play-btn']"));
        playNextSongBtn.click();
    }
    public boolean isSongPlaying (){
        WebElement soundbar = driver.findElement(By.xpath("//div[@data-testid=sound-bar-play']"));
        return soundbar.isDisplayed();
    }
=======
    //public void clickPlayBtn() {
        //WebElement playNextSongBtn = driver.findElement(By.xpath("//span[@data-testid='play-btn']"));
        //WebElement playBtn =driver.findElement(By.xpath("//i[@data-testid='play-next-btn']"));
        //playNextSongBtn.click();
        //playBtn.click();




    public void iPushTheButtonPlay() throws InterruptedException {

        String playNextButtonLocator = "//i[@data-testid='play-next-btn']";
        WebElement playNextButtonElement = driver.findElement(By.xpath(playNextButtonLocator));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", playNextButtonElement);
        jsExecutor.executeScript("arguments[0].click();", playNextButtonElement);

        String playButtonLocator = "//span[@data-testid='play-btn']";
        WebElement playButtonElement = driver.findElement(By.xpath(playButtonLocator));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", playButtonElement);
        jsExecutor.executeScript("arguments[0].click();", playButtonElement);
    }


    public boolean isSongPlaying (){
       WebElement soundbar = driver.findElement(By.xpath("//div[@data-testid=sound-bar-play']"));
        return soundbar.isDisplayed();

>>>>>>> Homework-18



}
<<<<<<< HEAD
=======

}




>>>>>>> Homework-18
