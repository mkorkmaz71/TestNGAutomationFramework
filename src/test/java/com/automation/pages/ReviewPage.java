package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReviewPage {
    WebDriver driver;

    public ReviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void printReviewPageDetails() {
        WebElement total = driver.findElement(By.xpath("//div[contains(@class, 'summary_total_label')]"));
        System.out.println(total.getText());
    }

    public void clickOnFinish() {
        WebElement finish = driver.findElement(By.id("finish"));
        finish.click();
    }
}