package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement errorMsg;

    public void doLogin(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

    public void verifyLoginPage() {
        Assert.assertTrue(usernameInput.isDisplayed());
        Assert.assertTrue(passwordInput.isDisplayed());
        Assert.assertTrue(loginBtn.isDisplayed());
    }

    public void verifyInvalidLoginErrorIsDisplayed() {
        Assert.assertTrue(errorMsg.isDisplayed());
    }
}