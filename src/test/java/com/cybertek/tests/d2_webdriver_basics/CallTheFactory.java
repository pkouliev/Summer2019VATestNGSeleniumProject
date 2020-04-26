package com.cybertek.tests.d2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallTheFactory {

    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("CHROME");
        driver.get("https:google.com");

//        WebDriver driver1 = WebDriverFactory.getDriver("firefox");

    }
}
