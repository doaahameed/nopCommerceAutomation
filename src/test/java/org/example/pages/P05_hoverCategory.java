package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

public class P05_hoverCategory {

    public WebElement electronicsMenu() {
        WebElement electronics = Hooks.driver.findElement(By.cssSelector("ul[class='top-menu notmobile'] a[href='/electronics']"));
        return electronics;
    }

    public WebElement cameraSubCategory() {
        WebElement cameraPhotosSub = Hooks.driver.findElement(By.cssSelector("ul[class='top-menu notmobile'] a[href='/camera-photo']"));
        return cameraPhotosSub;
    }


}
