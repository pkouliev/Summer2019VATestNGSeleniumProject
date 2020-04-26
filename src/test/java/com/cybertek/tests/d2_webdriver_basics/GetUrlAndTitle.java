package com.cybertek.tests.d2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlAndTitle {

    public static void main(String[] args) {
        // set up chrome driver
        WebDriverManager.chromedriver().setup();
        // open chrome browser
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.jetbrains.com/idea/download/");

        // get the title of the page
        String title = driver.getTitle();

        System.out.println("title = "+title);

        // getCurrentUrl(); --> get url of this page
        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);

        // getPageSource(); -->
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);
    }
}
