package com.windi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    public static WebDriver driver;

    protected void getDriver()  {
        FirefoxOptions options = new FirefoxOptions();
//        options.addArguments("--headless"); // Running Firefox in headless mode
//        options.addArguments("--no-sandbox"); // Optional for sandboxing
//        options.addArguments("--disable-dev-shm-usage"); // Prevent issues with large files in shared memory

        // Setting up GeckoDriver (Firefox)
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver(options);
    }
}
