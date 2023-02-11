package com.companyname.projectname.qa.pages;

import com.companyname.projectname.qa.utils.CommonUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutYourInformationPage extends CommonUtils {

    @FindBy (xpath = "//input[@placeholder=\"First Name\"]")
    public WebElement enterFirstName;

    @FindBy (xpath = "//input[@placeholder=\"Last Name\"]")
    public WebElement enterLastName;

    @FindBy (xpath = "//input[@placeholder=\"Zip/Postal Code\"]")
    public WebElement enterZipPostalCode;

    @FindBy (xpath = "//input[@class=\"submit-button btn btn_primary cart_button btn_action\"]")
    public WebElement clickContinueBtn;

    public CheckoutYourInformationPage()
    {
        PageFactory.initElements(driver, this);
    }
}
