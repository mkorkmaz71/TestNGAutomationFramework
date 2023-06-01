package com.automation.test;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import org.testng.annotations.Test;

public class CartPageValidationTest extends BaseTest {
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);

    @Test
    public void verifyUserCanRemoveItemFromCart() {
        loginPage.doLogin();
        homePage.clickOnAddToCartBtnOfFirstProduct();
        homePage.clickOnCartIcon();
    }
}
