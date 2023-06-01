package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderConfirmationPage {
    WebDriver driver;

    public OrderConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyConfirmationPageDisplayed() {
        WebElement confirmation = driver.findElement(By.id("checkout_complete_container"));
        System.out.println(confirmation.getText());
    }
}
