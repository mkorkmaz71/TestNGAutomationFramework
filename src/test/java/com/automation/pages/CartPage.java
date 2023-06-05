package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(name = "checkout")
    WebElement checkout;

    public void clickOnCheckoutBtn() {
        checkout.click();
    }
}