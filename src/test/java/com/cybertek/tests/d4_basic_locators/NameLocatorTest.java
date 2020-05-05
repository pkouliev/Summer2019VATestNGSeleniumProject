package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullName = driver.findElement(By.name("full_name"));
        fullName.sendKeys("John Doe");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("johndoe@cybertekschool.com");

        WebElement submitButton = driver.findElement(By.name("wooden_spoon"));
        submitButton.click();

        Thread.sleep(3000);
        driver.quit();

    }
}
