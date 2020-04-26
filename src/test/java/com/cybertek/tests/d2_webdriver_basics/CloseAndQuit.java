package com.cybertek.tests.d2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//         TODO close one tab out of one
//        driver.get("http:practice.cybertekschool.com");
//
//        Thread.sleep(2000);
        // close(); --> close the current tab/window
//        driver.close();

        //
        //driver = new ChromeDriver();

        // TODO close one tab out of two tabs
        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(5000);
//        driver.close();

        // TODO close all open tabs
        // close all open windows and tabs and everything else ok
        driver.quit();
    }
}
