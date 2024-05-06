import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest {

    @Test
    public void playSong () throws InterruptedException{
        String url= "https://qa.koel.app";

        provideEmail("tassadit.talbi@testpro.io");
        providePassword("Password2026@");
        clickLoginBtn();
        Thread.sleep(4000);
        //Assert.assertEquals(driver.getCurrentUrl(), url);
        //Thread.sleep(2000);
        iPushTheButtonPlay();
        Thread.sleep(2000);
        Assert.assertTrue(isSongPlaying());








    }

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




}

}




