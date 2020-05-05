package com.cybertek.tests.d3_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.print.DocFlavor;

/**
 * open browser
 * go to http://practice.cybertekschool.com/forgot_password
 * enter any email
 * click on Retrieve password
 * verify that url changed to http://practice.cybertekschool.com/email_sent
 */
public class VerifyURLChanged {

    public static void main(String[] args) {
        // open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // enter any email
        WebElement emailInput = driver.findElement(By.name("email"));

        // sendKeys --> enters given text
        emailInput.sendKeys("admiralkunkka@email.com");

        // click on Retrieve password
        WebElement retrievePassword = driver.findElement(By.id("form_submit"));
        retrievePassword.click();

        // verify that url changed to http://practice.cybertekschool.com/email_sent
        String expected = "http://practice.cybertekschool.com/email_sent";
        String actual = driver.getCurrentUrl();

        if (expected.equals(actual)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // close the browser
        driver.quit();
    }

}
