package com.automation.test;

import com.automation.utils.ConfigReader;
import org.testng.annotations.Test;

public class CartPageValidationTest extends BaseTest {

    @Test
    public void verifyUserCanRemoveItemFromCart() {
        loginPage.doLogin(ConfigReader.getProperty("login.username"), ConfigReader.getProperty("login.password"));
        homePage.verifyHomePage();
        homePage.clickOnAddToCartBtnOfFirstProduct();
        homePage.clickOnCartIcon();
        cartPage.verifyPage();
        cartPage.removeItem();
        cartPage.verifyCartPageIsEmpty();
    }
}
