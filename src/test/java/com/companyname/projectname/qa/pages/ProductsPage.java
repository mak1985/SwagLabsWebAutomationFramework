package com.companyname.projectname.qa.pages;


import com.companyname.projectname.qa.utils.CommonUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class ProductsPage extends CommonUtils {

    @FindBy (xpath = "//div[@class='inventory_item']")
    public List<WebElement> list;


    @FindBy(xpath = "//span[text()='Products']")
    public WebElement verifyProductBanner;

    @FindBy (xpath = "//button[@data-test=\"add-to-cart-sauce-labs-backpack\"]")
    public WebElement addToCartButton;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']/parent::a")
    public WebElement cartIcon;

    public ProductsPage()
    {
        PageFactory.initElements(driver, this);
    }

}
