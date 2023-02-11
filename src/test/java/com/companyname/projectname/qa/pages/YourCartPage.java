package com.companyname.projectname.qa.pages;

import com.companyname.projectname.qa.utils.CommonUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage extends CommonUtils {

    @FindBy (xpath = "#item_4_title_link")
    public WebElement verifySelectedItem;

    @FindBy (xpath = "//button[@class='btn btn_action btn_medium checkout_button']")
    public WebElement clickCheckoutBtn;

    public YourCartPage()
    {
        PageFactory.initElements(driver, this);
    }
}
