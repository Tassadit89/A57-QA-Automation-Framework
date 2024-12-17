import Pages.RegistrationPage;
import org.testng.annotations.Test;

public class AccountCreation extends BaseTest{



    @Test

    public void createAccountWithCorrectCredentials(){

        RegistrationPage registrationPage= new RegistrationPage(getDriver());
         registrationPage.clickOnRegistrationBtn().provideEmail().clickSubmit()

    }
}
