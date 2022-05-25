package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P07_followUs {

    public WebElement facebookBtn() {

        return Hooks.driver.findElement(By.xpath("//a[@href='http://www.facebook.com/nopCommerce']"));
    }

    public WebElement twitterBtn() {
        return Hooks.driver.findElement(By.xpath("//a[@href='https://twitter.com/nopCommerce']"));
    }

    public WebElement newsLetterBtn() {
        return Hooks.driver.findElement(By.xpath("//a[@href='/news/rss/1']"));
    }

    public WebElement youtubeBtn() {
        return Hooks.driver.findElement(By.xpath("//a[@href='http://www.youtube.com/user/nopCommerce']"));
    }


}
