package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.example.pages.P09_shoppingCart;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class TC09_shoppingCartStepDefinition {

    P09_shoppingCart shoppingCart = new P09_shoppingCart();
    int shoppingCartNumber;

    @Given("user selects a category")
    public void user_selects_category() throws InterruptedException {
        shoppingCart.booksMenu().click();
        Thread.sleep(2000);
    }

    @When("user adds product to his shopping cart")
    public void user_adds_product_to_shopping_cart() {
        shoppingCart.addToCartBtn().get(2).click();

    }

    @Then("shopping cart success message should be displayed")
    public void shopping_cart_success_message_displayed() {

        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class='bar-notification success']")).isDisplayed());
    }

    @And("shopping cart count increased")
    public void shopping_cart_count_increased() {
        String shoppingCartCount = Hooks.driver.findElement(By.cssSelector("span[class='cart-qty']")).getText();
        shoppingCartCount = shoppingCartCount.replaceAll("[^0-9]", "");
        shoppingCartNumber = Integer.parseInt(shoppingCartCount);
        Assert.assertTrue(shoppingCartNumber > 0);
    }
}
