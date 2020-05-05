package com.cybertek.tests.d3_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Verify URL not changed
 * open chrome
 * go to http://practice.cybertekschool.com/forgot_password
 * click on Retrieve Password
 * verify that url did not change
 */
public class VerifyURLNotChanged {
    public static void main(String[] args) {
        // open chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // save the expected url
        String expectedURL = driver.getCurrentUrl();

        // click on Retrieve Password
        // WebElement --> class that represents elements from the webpage
        // finElement --> method used to find element on a page
        // returns a webelement
        WebElement retrievePassword = driver.findElement(By.id("form_submit"));

        // click() --> clicks element
        retrievePassword.click();

        // verify that url did not change
        String actualURL = driver.getCurrentUrl();

        if (actualURL.equals(expectedURL)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
