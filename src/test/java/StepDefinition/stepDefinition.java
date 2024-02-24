package StepDefinition;

import com.qa.HomePage.Homepage;
import com.qa.PasswordReset.PasswordReset;
import com.qa.loginPage.LoginPage;
import com.qa.utility.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class stepDefinition extends TestBase {

    LoginPage lp;
    WebDriver driver;
    Homepage hm;
    PasswordReset pr;

    @Given("I am on the login page")
    public void login_page() {
        driver =TestBase.initialization(driver);

    }
    @When("I enter valid credentials")
    public void validCredentials() {
       lp=new LoginPage(driver);
       lp.clickLogin("pneelesh970@gmail.com","India@123");
    }
    @When("I click on the login button")
    public void loginButton() {
      lp=new LoginPage(driver);
      lp.submitButton();
    }
    @Then("I should be logged in to my account")
    public void loggedIn() {
        lp=new LoginPage(driver);
        String loginpagetitle=driver.getTitle();
        System.out.println(loginpagetitle);
        Assert.assertEquals(loginpagetitle,"My Account");

    }


    @Then("I should be in HomePage")
    public void HomePage() {
        hm=new Homepage(driver);
        hm.verifyHomePage();
        hm.editLink();
    }

    @Given("user is on password reset page")
    public void passwordResetPage() {
       pr=new PasswordReset(driver);
       String title=driver.getTitle();
       Assert.assertEquals("title","Account Information");
    }

    @When("user check the change password checkbox")
    public void changePasswordCheckbox() {
       pr=new PasswordReset(driver);
       pr.pwdCheckBox();
    }

    @And("enter the current password new password and confirm password")
    public void passwordDetails() {
        pr=new PasswordReset(driver);
        pr.enterNewPwd("System@123","System@123","System@123");
    }

    @Then("user save the details")
    public void saveDetails() {
        pr=new PasswordReset(driver);
        pr.savePwdResetDetail();

    }
}

