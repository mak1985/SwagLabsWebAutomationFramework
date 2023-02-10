package com.companyname.projectname.qa.stepdefinition;


import com.companyname.projectname.qa.testbase.BaseClass;
import com.companyname.projectname.qa.utils.CommonUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void start()
    {
        BaseClass.setUp();
    }

    @After
    public void end(Scenario scenario) {
        byte[] picture;
        if(scenario.isFailed())
        {
            //take screenshot and save it in /failed
            picture = CommonUtils.takeScreenshot("failed/" + scenario.getName());
        }
        else
        {
            //take screenshot and save it in /passed folder
            picture = CommonUtils.takeScreenshot("passed/" + scenario.getName());
        }
        scenario.attach(picture, "image/png", scenario.getName());
        BaseClass.tearDown();
    }
}
