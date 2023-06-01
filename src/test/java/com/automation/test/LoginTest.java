package com.automation.test;

import com.automation.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage(driver);

    @Test
    public void verifyUserCanLogin() {
        loginPage.doLogin();
    }
}
