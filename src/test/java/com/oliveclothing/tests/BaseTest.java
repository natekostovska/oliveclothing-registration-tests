package com.oliveclothing.tests;

import com.oliveclothing.framework.Browser;
import com.oliveclothing.pages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    public String chromeBrowser = "chrome";
    //public String firefoxBrowser="gecko";
    public static final String URL = "https://www.oliveclothing.com/";

    Browser browser = new Browser();
    public SignInPage signInPage;

    @BeforeMethod
    public void su() {
        driver = browser.open(this.chromeBrowser);
        // driver=browser.open(this.firefoxBrowser);

        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 20);

        signInPage = new SignInPage(driver, wait);

    }

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {

        }
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}
