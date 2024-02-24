package com.qa.PasswordReset;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordReset {

WebDriver driver;
    @FindBy(xpath = "//*[@id='change-password']")
    WebElement passwordcheckbox;

    @FindBy(xpath ="//*[@id='current-password']")
    WebElement currentpwdd;

    @FindBy(xpath ="//*[@id='password']")
    WebElement newpwd;

    @FindBy(xpath = "//*[@id='password-confirmation']")
    WebElement confirmpwd;

    @FindBy(xpath = "//*[@class='action save primary']")
    WebElement savebutton;

    @FindBy(xpath = "//*[text()='You saved the account information.']")
    WebElement message;
    public PasswordReset(WebDriver vdriver) {
        this.driver=vdriver;
        PageFactory.initElements(driver, this);
    }

    public void pwdCheckBox(){
        passwordcheckbox.click();
    }

    public void enterNewPwd(String cr,String newPwd,String conpwd){

        currentpwdd.sendKeys(cr);
        newpwd.sendKeys(newPwd);
        confirmpwd.sendKeys(conpwd);
    }
    public void savePwdResetDetail(){

        savebutton.click();
        String aftersave=message.getText();
        System.out.println(aftersave);

    }
}
