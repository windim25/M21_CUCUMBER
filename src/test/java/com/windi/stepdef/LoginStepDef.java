package com.windi.stepdef;

import com.windi.BaseTest;
import com.windi.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStepDef {
    WebDriver driver;
    LoginPage loginPage;

    public LoginStepDef()   {
    driver = BaseTest.driver;
    loginPage = new LoginPage(driver);
    }

    @Then("user is on homepage")
    public void userIsOnHomepage() {

    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
       loginPage.inputUsername(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
       loginPage.inputPassword(password);
    }

    @When("user click login button")
    public void userClickLoginButton() throws InterruptedException {
        loginPage.clickLoginButton();
        Thread.sleep(1000);
    }

    @Then("user see error message {string}")
    public void userAbleToSeeErrorMessage(String errorMessage) {
        loginPage.validateErrorAppear(errorMessage);
        assertTrue(driver.getPageSource().contains(errorMessage));
    }
}
