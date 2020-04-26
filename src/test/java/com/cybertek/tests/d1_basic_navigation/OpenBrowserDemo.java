package com.cybertek.tests.d1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserDemo {

    public static void main(String[] args) {

        // option+enter MAC
        // alt+enter WIN

        // we HAVE TO enter this line every time we want to open
        // without it we get exception
        WebDriverManager.chromedriver().setup();

        // this part is selenium
        // WebDriver --> represents browser
        // new ChromeDriver() --> this line opens chrome browser
        WebDriver driver = new ChromeDriver();
    }
}
