package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_Search {

    public WebElement searchTab(){
        By searchField = By.xpath("//*[@id ='small-searchterms']");
        WebElement search = Hooks.driver.findElement(searchField);
        return search;
    }



}
