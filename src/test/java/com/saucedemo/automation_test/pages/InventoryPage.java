package com.saucedemo.automation_test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    private WebDriver driver;

    private By inventoryContainer = By.id("inventory_container");
    private By backpackAddButton = By.id("add-to-cart-sauce-labs-backpack");
    private By cartIcon = By.className("shopping_cart_link");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isInventoryPageDisplayed() {
        return driver.getCurrentUrl().contains("inventory.html")
                && driver.findElement(inventoryContainer).isDisplayed();
    }

    public void addBackpackToCart() {
        driver.findElement(backpackAddButton).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }
}
