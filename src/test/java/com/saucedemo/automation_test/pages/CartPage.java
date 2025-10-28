package com.saucedemo.automation_test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartPage {
    private WebDriver driver;

   // private By itemName = By.className("inventory_item_name");
    private By itemPrice = By.className("inventory_item_price");
    private By cartItems = By.className("inventory_item_name");
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCartDetails() {
        String name = driver.findElement(cartItems).getText();
        String price = driver.findElement(itemPrice).getText();

        Assert.assertEquals(name, "Sauce Labs Backpack", "Item name mismatch!");
        Assert.assertEquals(price, "$29.99", "Item price mismatch!");
        
        public boolean isItemInCart(String itemName) {
        List<String> items = driver.findElements(cartItems)
                .stream()
                .map(e -> e.getText().trim())
                .collect(Collectors.toList());

        return items.contains(itemName);
    }
}
