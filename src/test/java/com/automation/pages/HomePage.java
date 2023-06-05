package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement item1;

    @FindBy(xpath = "//a[@class = 'shopping_cart_link']")
    WebElement cart;

    public void clickOnAddToCartBtnOfFirstProduct() {
        item1.click();
    }

    public void clickOnCartIcon() {
        cart.click();
    }

}
