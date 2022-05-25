package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Login {

    public WebElement emailAddress() {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement password() {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public void loginData(String email, String password) {
        emailAddress().sendKeys(email);
        password().sendKeys(password);
    }

    public WebElement loginBtn() {
        return Hooks.driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
    }
}
