package com.saucedemo.automation_test.tests;

import com.saucedemo.automation_test.base.BaseTest;
import com.saucedemo.automation_test.pages.LoginPage;
import com.saucedemo.automation_test.pages.InventoryPage;
import org.testng.annotations.Test;
import org.testng.Assert;

public class LoginTest extends BaseTest {

    @Test
    public void verifyValidLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        // 👇 Add short pauses for visibility
        Thread.sleep(2000); // Wait 2 seconds

        Assert.assertTrue(inventoryPage.isInventoryPageDisplayed(),
                "Login failed — Inventory page not displayed!");

        Thread.sleep(2000); // Wait before closing
    }
}
