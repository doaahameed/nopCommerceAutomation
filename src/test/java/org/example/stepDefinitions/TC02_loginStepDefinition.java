package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.example.pages.P02_Login;

public class TC02_loginStepDefinition {

    P02_Login login = new P02_Login();

    @Given("user clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
        Hooks.driver.findElement(By.cssSelector("a[class='ico-login']")).click();
        Thread.sleep(2000);
    }

    @When("^user enters valid \"(.*)\" and \"(.*)\"$")
    public void user_enters_valid_credentials(String email, String password) {
        login.loginData(email, password);
    }

    @And("user hits login")
    public void user_hits_login() throws InterruptedException {
        login.loginBtn().click();
        Thread.sleep(2000);
    }

    @Then("user logins successfully and redirected to home page")
    public void user_logins_successfully() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("a[class='ico-account']")).isDisplayed());

    }

}
