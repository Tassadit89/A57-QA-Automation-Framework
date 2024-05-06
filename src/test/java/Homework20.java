import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework20 extends BaseTest{

   @Test

   public void deletePlaylist () {
       String url = "https://qa.koel.app";

       provideEmail("tassadit.talbi@testpro.io");
       providePassword("Password2026@");
       clickLoginBtn();
       Assert.assertEquals(driver.getCurrentUrl(), url); //https://qa.koel.app/
       



    }




}
