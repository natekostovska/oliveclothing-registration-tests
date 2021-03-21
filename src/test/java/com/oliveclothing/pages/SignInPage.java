package com.oliveclothing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

    WebDriver driver;
    WebDriverWait wait;

    public SignInPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    By signIn = By.xpath("//*[@class='navUser-section navUser-section--alt']/li[3]/a");
    By newAccount = By.xpath("//*[@class='login-body']/a/button");
    By title = By.xpath("//*[@class='container']/h1");
    By email = By.xpath("//*[@id=\"FormField_1_input\"]");
    By password = By.xpath("//*[@id=\"FormField_2_input\"]");
    By confirmpass = By.xpath("//*[@id=\"FormField_3_input\"]");
    By country = By.xpath("//*[@id=\"FormField_11_select\"]");
    By firstName = By.xpath("//*[@id=\"FormField_4_input\"]");
    By lastName = By.xpath("//*[@id=\"FormField_5_input\"]");
    By addressLine1 = By.xpath("//*[@id=\"FormField_8_input\"]");
    By addressLine2 = By.xpath("//*[@id=\"FormField_9_input\"]");
    By companyHouseName = By.xpath("//*[@id=\"FormField_6_input\"]");
    By suburbCity = By.xpath("//*[@id=\"FormField_10_input\"]");
    By stateProvince = By.xpath("//*[@id=\"FormField_12_input\"]");
    By zipPostcode = By.xpath("//*[@id=\"FormField_13_input\"]");
    By phoneNumber = By.xpath("//*[@id=\"FormField_7_input\"]");
    By subscribe = By.xpath("//*[@id=\"FormField_34\"]/label[2]");
    By clickCreateAccount = By.xpath("//*[@class='form-actions']/input");
    By collectionPreferences = By.xpath("//*[@id=\"FormField_31\"]/input");

    public void clickSignIn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signIn)).click();
    }

    public void clickNewAccount() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(newAccount)).click();
    }

    public String getTitleNewAccount() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(title)).getText();
    }

    public void enterEmail(String mail) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys(mail);
    }

    public void enterPassword(String pass) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(pass);
    }

    public void enterConfirmPassword(String confirm) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmpass)).sendKeys(confirm);
    }

    public void selectCountry(String c) {
        Select select = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(country)));
        select.selectByValue(c);
    }

    public void enterFirstNameandLastName(String first, String last) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys(first);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastName)).sendKeys(last);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
    }

    public void enterAddressLine1and2(String ad1, String ad2) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addressLine1)).sendKeys(ad1);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addressLine2)).sendKeys(ad2);
    }

    public void enterCompanyHouseName(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(companyHouseName)).sendKeys(name);
    }

    public void enterSuburbCity(String suburbcity) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(suburbCity)).sendKeys(suburbcity);
    }

    public void enterStateProvinceandZipPostcode(String province, String postcode) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(stateProvince)).sendKeys(province);
        wait.until(ExpectedConditions.visibilityOfElementLocated(zipPostcode)).sendKeys(postcode);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
    }

    public void enterPhoneNumber(String number) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumber)).sendKeys(number);
    }

    public void clickCreate() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickCreateAccount)).click();
    }

    public void clickSubscribe() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(subscribe)).click();
    }

    public void clickCollectionPreference(int i) {
        Actions actions = new Actions(driver);
        WebElement click = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(collectionPreferences)).get(i);
        actions.moveToElement(click).click().perform();
    }

}
