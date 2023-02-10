package com.companyname.projectname.qa.stepdefinition;

import com.companyname.projectname.qa.utils.CommonUtils;
import com.companyname.projectname.qa.utils.ConfigsReader;
import io.cucumber.java.en.*;

public class LoginTest extends CommonUtils {

    @Given("User is on SauceLabs login page")
    public void user_is_on_sauce_labs_login_page() {
        getPageTitle();

    }
    @When("User enters username and password")
    public void user_enters_username_and_password() {
        enterText(loginPage.userName, ConfigsReader.getProperty("username"));
        enterText(loginPage.password, ConfigsReader.getProperty("password"));
    }
    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        click(loginPage.loginButton);
    }
    @Then("User should navigated to product home page")
    public void user_should_navigated_to_product_home_page() {

    }

}
