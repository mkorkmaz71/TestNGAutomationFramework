package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(name = "checkout")
    WebElement checkoutBtn;

    @FindBy(xpath = "//button[contains(@id, 'remove')]")
    WebElement removeBtn;

    @FindBy(id = "continue-shopping")
    WebElement continueShopping;

    @FindBy(xpath = "//div[@class='header_secondary_container']//span")
    WebElement pageTitle;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    List<WebElement> itemList;

    public void clickOnCheckoutBtn() {
        checkoutBtn.click();
    }

    public void verifyPage() {
        Assert.assertTrue(pageTitle.isDisplayed());
        Assert.assertTrue(checkoutBtn.isDisplayed());
        Assert.assertTrue(continueShopping.isDisplayed());
    }

    public void removeItem() {
        removeBtn.click();
    }

    public void verifyCartPageIsEmpty() {
        Assert.assertTrue(itemList.size() == 0);
    }
}
