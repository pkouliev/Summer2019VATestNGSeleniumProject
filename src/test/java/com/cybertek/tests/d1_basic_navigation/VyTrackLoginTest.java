package com.cybertek.tests.d1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VyTrackLoginTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // go to login page
        // enter credentials + click login button
        // verify that user logged in successfully
        driver.get("https://qa3.vytrack.com/user/login");
        driver.findElement(By.id("prependedInput")).sendKeys("user2");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");

        //driver.findElement(By.id("_submit")).click();
        WebElement loginButton = driver.findElement(By.id("_submit"));
        loginButton.click();

        //verify
        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("Expected Result --> " + expectedTitle);
            System.out.println("Actual Result --> " + actualTitle);
        }

        String expectedURL = "https://qa3.vytrack.com/";
        String actualURL = driver.getCurrentUrl();

        if (expectedURL.equals(actualURL)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("Expected URL --> " + expectedURL);
            System.out.println("Actual URL --> " + actualURL);
        }

        Thread.sleep(3000);
        driver.quit();

    }
}
