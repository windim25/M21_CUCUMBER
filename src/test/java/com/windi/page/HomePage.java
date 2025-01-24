package com.windi.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.windi.BaseTest.driver;

public class HomePage {

    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    private WebDriver driver;

    public HomePage(WebDriver driver) { this.driver = driver; }

    public void validateOnHomePage() {
        WebElement productElement = driver.findElement(productTitle);
        Assert.assertTrue(productElement.isDisplayed());
        Assert.assertEquals("Sauce Labs Backpack", productElement. getText());
    }
}