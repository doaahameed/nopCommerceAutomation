package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_hoverCategory;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Locale;

public class TC05_hoverCategoryStepDefinition {
    Actions action = new Actions(Hooks.driver);
    P05_hoverCategory hoverCategory = new P05_hoverCategory();
    String subCategName;

    @Given("user hovers over category")
    public void user_hovers_over_category() throws InterruptedException {
        action.moveToElement(hoverCategory.electronicsMenu()).perform();
        Thread.sleep(2000);
    }

    @When("user selects sub category")
    public void user_selects_sub_category() throws InterruptedException {
        subCategName = hoverCategory.cameraSubCategory().getText().toLowerCase().trim();
        System.out.println(subCategName);
        hoverCategory.cameraSubCategory().click();
        Thread.sleep(2000);
    }

    @Then("page redirects to sub category products list")
    public void page_redirects_to_subcategory_product_list() {

        String pageTitle = Hooks.driver.findElement(By.cssSelector("div[class='page-title']")).getText().toLowerCase(Locale.ROOT);
        Assert.assertEquals(pageTitle.contains(subCategName), true);
    }

}
