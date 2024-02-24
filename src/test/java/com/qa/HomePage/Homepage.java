package com.qa.HomePage;

import com.qa.PasswordReset.PasswordReset;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    WebDriver driver;

    @FindBy(xpath="//*[contains(text(),'My Orders')]")
    WebElement myaccount;

    @FindBy(xpath="//*[text()='Edit']")
    WebElement editbutton;
    public Homepage(WebDriver vdriver) {
        this.driver=vdriver;
        PageFactory.initElements(driver, this);
    }

    public boolean verifyHomePage(){
        return myaccount.isDisplayed();

    }
    public PasswordReset editLink(){

        editbutton.click();
        return new PasswordReset(driver);
    }
}
