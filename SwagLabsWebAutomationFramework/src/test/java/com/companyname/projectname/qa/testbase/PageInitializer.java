package com.companyname.projectname.qa.testbase;


import com.companyname.projectname.qa.pages.LoginPage;

public class PageInitializer extends BaseClass {
    public static LoginPage loginPage;
    public static void initialize() {
        // initialize pages
         loginPage = new LoginPage();

    }
}
