package com.automation.test;

import com.automation.utils.ConfigReader;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyUserCanLogin() {
        loginPage.doLogin(ConfigReader.getProperty("login.username"), ConfigReader.getProperty("login.password"));
    }

    @Test
    public void verifyUserCanNotLoginWithInvalidCredentials() {
        loginPage.doLogin(ConfigReader.getProperty("invalid.username"), ConfigReader.getProperty("invalid.password"));
        loginPage.verifyInvalidLoginErrorIsDisplayed();
    }
}
