package com.companyname.projectname.qa.helpers;


import com.companyname.projectname.qa.utils.CommonUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkHelper extends CommonUtils {
	
	public static WebDriver driver;
	
	public LinkHelper(WebDriver driver) {
		super();
		LinkHelper.driver = driver;
	
	}
	
	public String getHyperLink(WebElement element) {
		String link = element.getAttribute("hreg");
		return link;
	}
}
