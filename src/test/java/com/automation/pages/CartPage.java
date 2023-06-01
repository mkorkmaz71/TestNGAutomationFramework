package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnCheckoutBtn() {
        WebElement checkout = driver.findElement(By.name("checkout"));
        checkout.click();
    }
}