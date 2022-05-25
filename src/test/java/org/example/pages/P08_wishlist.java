package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P08_wishlist {

    public List<WebElement> wishlistBtn() {
        return Hooks.driver.findElements(By.cssSelector("button[class='button-2 add-to-wishlist-button']"));
    }
}
