package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

public class P01_Registration {

    //Gender locator
    public WebElement selectGender() {
        WebElement gender = Hooks.driver.findElement(By.id("gender-female"));
        return gender;
    }

    //Firstname
    public WebElement enterFName() {
        By firstName = By.id("FirstName");
        WebElement fName = Hooks.driver.findElement(firstName);
        return fName;
    }

    //Lastname
    public WebElement enterLName() {
        By lastName = By.id("LastName");
        WebElement lName = Hooks.driver.findElement(lastName);
        return lName;
    }

    //Select Date of Birth (Day - Month - Year)
    public WebElement selectDayOB() {
        WebElement selectDay = Hooks.driver.findElement(By.xpath("//*[@name='DateOfBirthDay']/option[17]"));
        return selectDay;
    }

    public WebElement selectMonthOB() {
        WebElement selectMonth = Hooks.driver.findElement(By.xpath("//*[@name='DateOfBirthMonth']/option[5]"));
        return selectMonth;
    }

    public WebElement selectYearOB() {
        WebElement selectYear = Hooks.driver.findElement(By.xpath("//*[@name='DateOfBirthYear']/option[83]"));
        return selectYear;
    }

    //Email Address
    public WebElement emailAdd() {
        By email = By.id("Email");
        WebElement emailAddress = Hooks.driver.findElement(email);
        return emailAddress;
    }

    //Company name
    public WebElement enterCompany() {
        By companyName = By.id("Company");
        WebElement company = Hooks.driver.findElement(companyName);
        return company;
    }

    //Password
    public WebElement enterPassword() {
        return Hooks.driver.findElement(By.id("Password"));
    }

    //Confirm Password
    public WebElement confirmPassword() {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    //Register Button
    public WebElement registerBtn() {
        return Hooks.driver.findElement(By.id("register-button"));
    }

}
