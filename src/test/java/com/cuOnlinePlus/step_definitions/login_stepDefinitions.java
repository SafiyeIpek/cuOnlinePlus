package com.cuOnlinePlus.step_definitions;

import com.cuOnlinePlus.pages.LoginPage;
import com.cuOnlinePlus.utilities.ConfigurationReader;
import com.cuOnlinePlus.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_stepDefinitions {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("the user enters username, password and access key")
    public void the_user_enters_username_password_and_access_key() throws InterruptedException {

        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {

    }

}
