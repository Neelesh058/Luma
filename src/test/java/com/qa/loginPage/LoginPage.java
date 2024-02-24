package com.qa.loginPage;

import com.qa.HomePage.Homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private   WebDriver driver;
    @FindBy(id="email")
    WebElement login_id;

    @FindBy(id="pass")
    WebElement login_pwd;

    @FindBy(xpath="//*[text()='Sign In']")
    WebElement sign_in;

    public LoginPage(WebDriver vdriver)
    {

        this.driver= vdriver;
        PageFactory.initElements(driver, this);

    }
    public void clickLogin(String un,String pwd){

    login_id.sendKeys(un);
    login_pwd.sendKeys(pwd);


    }
    public Homepage submitButton(){

        sign_in.click();
        return new Homepage(driver);

    }
}
