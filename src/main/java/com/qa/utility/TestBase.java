package com.qa.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
  static WebDriver driver;
    public  static WebDriver initialization(WebDriver driver){

        WebDriverManager.chromedriver().setup();
        TestBase.driver =new ChromeDriver();
        TestBase.driver.get("https://magento.softwaretestingboard.com/customer/account/login");
        TestBase.driver.manage().window().maximize();
        return TestBase.driver;


    }


}
