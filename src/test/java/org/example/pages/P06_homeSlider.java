package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P06_homeSlider {

    public WebElement homeSlider(String sliderNo) {

        return Hooks.driver.findElement(By.xpath("(//a[@href='http://demo.nopcommerce.com/'])[" + sliderNo + "]"));
    }
}
