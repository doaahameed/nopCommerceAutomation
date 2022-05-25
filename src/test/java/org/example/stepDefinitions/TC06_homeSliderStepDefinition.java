package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.example.pages.P06_homeSlider;

import java.time.Duration;

public class TC06_homeSliderStepDefinition {
    P06_homeSlider homeSlider = new P06_homeSlider();

    @When("user click on first slider")
    public void user_clicks_on_first_slider() throws InterruptedException {
        homeSlider.homeSlider("1").click();
        Thread.sleep(2000);
    }

    @Then("related product page opens for first slider")
    public void related_product_page_opens_for_first_slider() {
        String expectedResult = "https://demo.nopcommerce.com/nokia-lumia-1020";
        Assert.assertEquals(Hooks.driver.getCurrentUrl().contains(expectedResult), true);
    }

    @When("user clicks on second slider")
    public void user_clicks_on_second_slider() throws InterruptedException {
        homeSlider.homeSlider("2").click();
        Thread.sleep(2000);

    }

    @Then("related product page opens for second slider")
    public void related_product_page_opens_for_second_slider() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        boolean conditionChecker = wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/iphone-6"));
        Assert.assertTrue(conditionChecker);
    }
}
