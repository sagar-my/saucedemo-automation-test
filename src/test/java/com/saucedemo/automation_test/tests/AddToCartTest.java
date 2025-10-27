package com.saucedemo.automation_test.tests;

import com.saucedemo.automation_test.base.BaseTest;
import com.saucedemo.automation_test.pages.LoginPage;
import com.saucedemo.automation_test.pages.InventoryPage;
import com.saucedemo.automation_test.pages.CartPage;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    @Test
    public void testAddToCart() {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);

        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.addBackpackToCart();
        inventoryPage.goToCart();
        cartPage.verifyCartDetails();
    }
}
