package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement zip;

    @FindBy(id = "continue")
    WebElement continueBtn;

    public void fillShippingDetails() {
        firstName.sendKeys(ConfigReader.getProperty("checkout.firstName"));
        lastName.sendKeys(ConfigReader.getProperty("checkout.lastName"));
        zip.sendKeys(ConfigReader.getProperty("checkout.zip"));
    }

    public void clickOnContinueBtn() {
        continueBtn.click();
    }
}