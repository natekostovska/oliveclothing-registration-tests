package com.oliveclothing.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTests extends BaseTest{

    @Test
    public void first(){

        driver.navigate().to(URL);
        signInPage.clickSignIn();
        signInPage.clickNewAccount();
        signInPage.getTitleNewAccount();
        Assert.assertEquals(signInPage.getTitleNewAccount(),"NEW ACCOUNT");
        signInPage.enterEmail("nate12224@gmail.com");
        signInPage.enterPassword("123456789A");
        signInPage.enterConfirmPassword("123456789A");
        // index od 0-2 za womenswear,menswear,both
        signInPage.clickCollectionPreference(0);
        signInPage.selectCountry("Macedonia, the Former Yugoslav Republic of");
        signInPage.enterFirstNameandLastName("Natasha","Kostovska");
        signInPage.enterAddressLine1and2("Tasko Karadza","Pero Nakov");
        signInPage.enterCompanyHouseName("EVN");
        signInPage.enterSuburbCity("Skopje");
        signInPage.enterStateProvinceandZipPostcode("GaziBaba","1000");
        signInPage.enterPhoneNumber("078444444");
        signInPage.clickSubscribe();
        signInPage.clickCreate();
        sleep(5000);
    }
}
