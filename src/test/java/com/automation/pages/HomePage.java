package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnAddToCartBtnOfFirstProduct() {
        WebElement item1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        item1.click();
    }

    public void clickOnCartIcon() {
        WebElement cart = driver.findElement(By.xpath("//a[@class = 'shopping_cart_link']"));
        cart.click();
    }

}
