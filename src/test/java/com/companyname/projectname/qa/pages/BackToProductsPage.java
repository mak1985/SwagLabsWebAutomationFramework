package com.companyname.projectname.qa.pages;

import com.companyname.projectname.qa.utils.CommonUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackToProductsPage extends CommonUtils {

    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory'][text()='Add to cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a")
    public WebElement cartIcon;
    public BackToProductsPage()
    {
        PageFactory.initElements(driver, this);
    }
}
