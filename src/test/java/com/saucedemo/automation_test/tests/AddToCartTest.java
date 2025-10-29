package com.saucedemo.automation_test.tests;

import com.saucedemo.automation_test.base.BaseTest;
import com.saucedemo.automation_test.pages.LoginPage;
import com.saucedemo.automation_test.pages.InventoryPage;
import com.saucedemo.automation_test.pages.CartPage;
import org.testng.annotations.Test;
import org.testng.Assert;

public class AddToCartTest extends BaseTest {

    @Test
    public void verifyAddMultipleItemsToCart() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.addItemToCart("Sauce Labs Backpack");
        Thread.sleep(2000); 
        inventoryPage.addItemToCart("Sauce Labs Bike Light");
        Thread.sleep(2000);
        inventoryPage.goToCart();
        cartPage.verifyCartDetails();
        Assert.assertTrue(cartPage.isItemInCart("Sauce Labs Backpack"), "Backpack not found in cart!");
        Assert.assertTrue(cartPage.isItemInCart("Sauce Labs Bike Light"), "Bike Light not found in cart!");
        Thread.sleep(2000);
    }
}
