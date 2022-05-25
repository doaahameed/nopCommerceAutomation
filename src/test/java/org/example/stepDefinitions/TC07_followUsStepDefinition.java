package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P07_followUs;
import org.testng.Assert;

import java.util.ArrayList;

public class TC07_followUsStepDefinition {
    P07_followUs followUs = new P07_followUs();

    @When("user clicks on facebook icon")
    public void user_clicks_on_facebook_icon() {
        followUs.facebookBtn().click();

    }

    @Then("facebook should open page url in new tab")
    public void facebook_opens_page_url_in_new_tab() throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));

        String actualResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualResult.contains("https://www.facebook.com/nopCommerce"), true);
        Hooks.driver.close();
    }

    @When("user clicks on twitter icon")
    public void user_clicks_on_twitter_icon() {
        followUs.twitterBtn().click();
    }

    @Then("twitter should open page url in new tab")
    public void twitter_opens_page_url_in_new_tab() throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));

        String actualResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualResult.contains("https://twitter.com/nopCommerce"), true);
        Hooks.driver.close();
    }

    @When("user clicks on newsletter icon")
    public void user_clicks_on_newsletter_icon() {
        followUs.newsLetterBtn().click();
    }

    @Then("newsletter should open page url in new tab")
    public void newsletter_opens_page_url_in_new_tab() throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));

        String actualResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualResult.contains("https://demo.nopcommerce.com/new-online-store-is-open"), true);
        Hooks.driver.close();
    }

    @When("user clicks on youtube icon")
    public void user_clicks_on_youtube_icon() {
        followUs.youtubeBtn().click();
    }

    @Then("youtube should open page url in new tab")
    public void youtube_opens_page_url_in_new_tab() throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));

        String actualResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualResult.contains("https://www.youtube.com/user/nopCommerce"), true);
        Hooks.driver.close();
    }
}
