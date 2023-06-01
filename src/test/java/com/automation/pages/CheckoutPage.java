package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillShippingDetails() {
        WebElement firstName = driver.findElement(By.id("first-name"));
        WebElement lastName = driver.findElement(By.id("last-name"));
        WebElement zip = driver.findElement(By.id("postal-code"));
        firstName.sendKeys("Diana");
        lastName.sendKeys("Pelivan");
        zip.sendKeys("33578");
    }

    public void clickOnContinueBtn() {
        WebElement continueBtn = driver.findElement(By.id("continue"));
        continueBtn.click();
    }
}