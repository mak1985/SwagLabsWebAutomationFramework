package com.companyname.projectname.qa.stepdefinition;

import com.companyname.projectname.qa.utils.CommonUtils;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderProductTest extends CommonUtils {
    @Given("User is on SwagLabs webpage")
    public void user_is_on_swag_labs_webpage()
    {
        getPageTitle();
    }
    @When("User enters {string}")
    public void user_enters(String uname) {
        enterText(loginPage.userName,uname);
    }
    @And("User entered {string}")
    public void user_entered(String pwd) {
        enterText(loginPage.password,pwd);
    }
    @When("User clicks login button")
    public void user_clicks_login_button() {
        click(loginPage.loginButton);
    }
    @Then("User should navigated to products page and see products list on page")
    public void user_should_navigated_to_products_page_and_see_products_list_on_page() {

    }
    @When("User clicks on item with name {string}")
    public void userClicksOnItemWithName(String productName) {
        for (WebElement myList : productsPage.list)
        {
            if(myList .getText().equals(productName))
            {
                click(myList);
                break;
            }
        }

    }
    @And("User clicks on add to cart button")
    public void userClicksOnAddToCartButton() {
        click(backToProductsPage.addToCartButton);
    }
    @When("User clicks add to cart")
    public void user_clicks_add_to_cart() {

    }
    @Then("Selected products should be added to card successfully")
    public void selected_products_should_be_added_to_card_successfully() {
        //Assert.assertEquals(productsPage.cartIcon, "1" );

    }
    @When("User clicks on cart icon")
    public void user_clicks_on_cart_icon() {
        click(backToProductsPage.cartIcon);
    }

    @Then("Selected products should be added under your cart")
    public void selected_products_should_be_added_under_your_cart() {

    }
    @When("User clicks on checkout button")
    public void user_clicks_on_checkout_button() {
        click(yourCartPage.clickCheckoutBtn);
    }
    @Then("User should be navigated to CHECKOUT: YOUR INFORMATION page")
    public void user_should_be_navigated_to_checkout_your_information_page() {

    }
    @When("User enters first name as {string}")
    public void userEntersFirstNameAs(String fname) {
        enterText(checkoutYourInformationPage.enterFirstName, fname);
    }

    @And("User enters last name as {string}")
    public void userEntersLastNameAs(String lname) {
        enterText(checkoutYourInformationPage.enterLastName, lname);
    }

    @And("User enters zip code as {string}")
    public void userEntersZipCodeAs(String zip) {
        enterText(checkoutYourInformationPage.enterZipPostalCode, zip);
    }
    @When("User clicks on continue button")
    public void user_clicks_on_continue_button() {
        click(checkoutYourInformationPage.clickContinueBtn);
    }
    @Then("User should able to see product name, cost, Payment Information, Shipping Information, Total information")
    public void user_should_able_to_see_product_name_cost_payment_information_shipping_information_total_information() {

    }
    @When("User clicks on finish button")
    public void user_clicks_on_finish_button() {
        click(checkoutOverviewPage.clickFinishBtn);
    }
    @Then("User should see THANK YOU FOR YOUR ORDER message")
    public void user_should_see_thank_you_for_your_order_message() {

    }
    @Then("Your order has been dispatched, and will arrive just as fast as the pony can get there")
    public void your_order_has_been_dispatched_and_will_arrive_just_as_fast_as_the_pony_can_get_there() {

    }


}
