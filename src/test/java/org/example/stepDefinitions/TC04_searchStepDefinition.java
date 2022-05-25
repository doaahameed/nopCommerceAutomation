package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import org.example.pages.P04_Search;

public class TC04_searchStepDefinition {
    P04_Search searchPage = new P04_Search();

    @Given("guest user clicks on search tab")
    public void guest_user_clicks_on_search() {
        searchPage.searchTab().clear();
        searchPage.searchTab().click();
    }

    @When("^guest user enters search keyword \"(.*)\"$")
    public void guest_user_enters_search_keyword(String keyword) {
        searchPage.searchTab().sendKeys(keyword);
    }

    @And("guest user hits enter to search")
    public void guest_user_hits_enter_to_search() throws InterruptedException {
        searchPage.searchTab().sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    @Then("search results are displayed for user with relevant data")
    public void search_results_displayed_with_relevant_data() {
        String expectedResult = "https://demo.nopcommerce.com/search?q=";
        String actualResult = Hooks.driver.getCurrentUrl();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualResult.contains(expectedResult));
        int size = Hooks.driver.findElements(By.cssSelector("[class ='product-item']")).size();
        softAssert.assertTrue(size>0);
        softAssert.assertAll();
    }

    @When("^guest user enters search sku \"(.*)\"$")
    public void guest_user_enters_search_sku(String sku){
        searchPage.searchTab().sendKeys(sku);
    }
}

