package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

    // write a static method that takes a string parameter
    // based on the value of the parameter
    // the method must return chromedriver or firefoxdriver object
    // name: getDriver

//    public static WebDriver getDriver(String browserType) {
//
//        if (browserType.toLowerCase().equalsIgnoreCase("Chrome")) {
//            WebDriverManager.chromedriver().setup();
//            // WebDriver driver = new ChromeDriver();
//            // return driver;
//            return new ChromeDriver();
//        } else if (browserType.toLowerCase().equalsIgnoreCase("Firefox")) {
//            WebDriverManager.firefoxdriver().setup();
//            // WebDriver driver = new FirefoxDriver();
//            // return driver;
//            return new FirefoxDriver();
//        } else {
//            return null;
//        }
//    }

    public static WebDriver getDriver(String browserType) {
        WebDriver driver = null;
        switch (browserType.toLowerCase()) {
            case "chrome" -> {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            }
            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
        }

        return driver;

    }
}
