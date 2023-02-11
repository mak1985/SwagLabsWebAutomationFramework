package com.companyname.projectname.qa.pages;

import com.companyname.projectname.qa.utils.CommonUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage extends CommonUtils {

    @FindBy (xpath = "//button[@class=\"btn btn_action btn_medium cart_button\"]")
    public WebElement clickFinishBtn;
    public CheckoutOverviewPage()
    {
        PageFactory.initElements(driver, this);
    }
}
