package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P09_shoppingCart {

    public WebElement booksMenu() {
        WebElement books = Hooks.driver.findElement(By.cssSelector("ul[class='top-menu notmobile'] a[href='/books']"));
        return books;
    }

    public List<WebElement> addToCartBtn() {
        return Hooks.driver.findElements(By.cssSelector("button[class='button-2 product-box-add-to-cart-button']"));
    }
}
