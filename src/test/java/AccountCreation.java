import Pages.LoginPage;
import Pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountCreation extends BaseTest{



    @Test

    public void createAccountWithCorrectCredentials(){

        String LinkConfirmationMsg ="We've sent a confirmation link to the email.Please continue by clicking on it";

        RegistrationPage registrationPage= new RegistrationPage(getDriver());
         registrationPage.clickOnRegistrationBtn().provideEmail("talbi.tassadit@testpro.io").clickSubmit();
        Assert.assertEquals(registrationPage.getConfirmationLinkMsg(),LinkConfirmationMsg);

    }
    @Test

    public void createAccountWithoutSpecialSymbol(){

        String errorMsg ="We've sent a confirmation link to the email.Please continue by clicking on it";

        RegistrationPage registrationPage= new RegistrationPage(getDriver());
        registrationPage.clickOnRegistrationBtn().provideEmail("talbi.tassadittestpro.io").clickSubmit();
        Assert.assertEquals(registrationPage.getConfirmationLinkMsg(),errorMsg);

    }
    @Test


    public void createAccountwithoutdot(){

        String errorMsg ="We've sent a confirmation link to the email.Please continue by clicking on it";

        RegistrationPage registrationPage= new RegistrationPage(getDriver());
        registrationPage.clickOnRegistrationBtn().provideEmail("talbi.tassadittestpro.io").clickSubmit();
        Assert.assertEquals(registrationPage.getConfirmationLinkMsg(),errorMsg);

    }
    @Test
    public void createAccountWithoutTestproDomain(){

        String errorMsg ="We've sent a confirmation link to the email.Please continue by clicking on it";

        RegistrationPage registrationPage= new RegistrationPage(getDriver());
        registrationPage.clickOnRegistrationBtn().provideEmail("talbi.tassadittestpro.io").clickSubmit();
        Assert.assertEquals(registrationPage.getConfirmationLinkMsg(),errorMsg);

    }

    @Test

    public void createAccountWithPlusSign(){

        String errorMsg ="We've sent a confirmation link to the email.Please continue by clicking on it";

        RegistrationPage registrationPage= new RegistrationPage(getDriver());
        registrationPage.clickOnRegistrationBtn().provideEmail("talbi.tassadittestpro.io").clickSubmit();
        Assert.assertEquals(registrationPage.getConfirmationLinkMsg(),errorMsg);

    }

    @Test

    public void createAccountWithAnExistingEmail(){
        String errorMsg ="We've sent a confirmation link to the email.Please continue by clicking on it";

        RegistrationPage registrationPage= new RegistrationPage(getDriver());
        registrationPage.clickOnRegistrationBtn().provideEmail("talbi.tassadittestpro.io").clickSubmit();
        Assert.assertEquals(registrationPage.getConfirmationLinkMsg(),errorMsg);

    }

    public void loginToNewAccountAfterRegistration(){
        RegistrationPage registrationPage= new RegistrationPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
       loginPage.provideEmail().providePassword().clickSubmit();
       
    }







}
