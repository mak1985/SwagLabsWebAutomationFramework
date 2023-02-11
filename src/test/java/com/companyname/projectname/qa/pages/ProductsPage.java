package com.companyname.projectname.qa.pages;


import com.companyname.projectname.qa.utils.CommonUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class ProductsPage extends CommonUtils {

    @FindBy (xpath = "//div[@class='app_logo']")
    public WebElement appLogo;
    @FindBy (xpath = "//div[@class='inventory_item_name']")
    public List<WebElement> list;
    @FindBy(xpath = "//span[text()='Products']")
    public WebElement verifyProductBanner;





    public ProductsPage()
    {
        PageFactory.initElements(driver, this);
    }

}
