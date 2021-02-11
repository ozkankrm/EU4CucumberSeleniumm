package com.vytrack.step_definitions;


import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.Callable;

public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {
      String url = ConfigurationReader.get("url");
       // WebDriver driver = Driver.get();
        Driver.get().get(url);

    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() throws InterruptedException {
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        LoginPage loginPage= new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() throws InterruptedException {
        BrowserUtils.waitFor(3);
       String actualTitle = Driver.get().getTitle();
       Assert.assertEquals("Dashboard",actualTitle);
    }

    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() {
        String username = ConfigurationReader.get("salesmanager_username");
        String password = ConfigurationReader.get("salesmanager_password");
        LoginPage loginPage= new LoginPage();
        loginPage.login(username,password);

    }

    @When("the user enters the store information")
    public void the_user_enters_the_store_information() {
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        LoginPage loginPage= new LoginPage();
        loginPage.login(username,password);
    }

    @When("the user logs is using {string} and {string}")
    public void the_user_logs_is_using_and(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }


    @Then("the title contains {string}")
    public void the_title_contains(String expectedTitle) {
        BrowserUtils.waitFor(3);
       String actualTitle = Driver.get().getTitle();
       BrowserUtils.waitFor(3);
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);


    }



}
