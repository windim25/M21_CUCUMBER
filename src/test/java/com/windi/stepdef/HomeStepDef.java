package com.windi.stepdef;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.windi.BaseTest;
import com.windi.page.HomePage;
import io.cucumber.java.en.Then;

public class HomeStepDef extends BaseTest {

    HomePage homePage;

    public void userIsOnHomepage()  {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }
}
