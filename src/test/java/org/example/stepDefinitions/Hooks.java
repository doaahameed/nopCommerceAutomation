package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver = null;

    //Defining Before and After annotations for driver

    @Before
    public void initiateBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);

        driver = new ChromeDriver();
        //Browser configurations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        //Navigate to NopCommerce website
        driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @After
    public void terminateBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
