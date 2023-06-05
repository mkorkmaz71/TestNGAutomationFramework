package com.automation.test;

import com.automation.utils.ConfigReader;
import org.testng.annotations.Test;

public class CartPageValidationTest extends BaseTest {

    @Test
    public void verifyUserCanRemoveItemFromCart() {
        loginPage.doLogin(ConfigReader.getProperty("login.username"), ConfigReader.getProperty("login.password"));
        homePage.clickOnAddToCartBtnOfFirstProduct();
        homePage.clickOnCartIcon();
    }
}
