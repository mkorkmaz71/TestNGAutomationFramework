package com.automation.test;

import com.automation.pages.*;
import org.testng.annotations.Test;

public class OrderConfirmationTest extends BaseTest {
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    CartPage cartPage = new CartPage(driver);
    CheckoutPage checkoutPage = new CheckoutPage(driver);
    ReviewPage reviewPage = new ReviewPage(driver);
    OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver);

    @Test
    public void orderConfirmation() {
        loginPage.doLogin();
        homePage.clickOnAddToCartBtnOfFirstProduct();
        homePage.clickOnCartIcon();
        cartPage.clickOnCheckoutBtn();
        checkoutPage.fillShippingDetails();
        checkoutPage.clickOnContinueBtn();
        reviewPage.printReviewPageDetails();
        reviewPage.clickOnFinish();
        orderConfirmationPage.verifyConfirmationPageDisplayed();
    }
}
