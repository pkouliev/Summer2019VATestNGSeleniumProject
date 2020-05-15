package com.cybertek.tests.o2_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchTests {
    public static void main(String[] args) {
        priceDetails();
        bookDetailsTest();
        titleTest();

    }

    /**
     * *
     * TS002: Book details
     * 1. Go to amazon.com
     * 2. Search for selenium cookbook
     * 3. Click on result Learn Selenium Testing Tools Cookbook - Second Edition
     * 4. Verify paperback price $44.99
     * 5. Verify Kindle price $22.39
     */
    private static void priceDetails() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://amazon.com");
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("selenium cookbook");
        WebElement searchBtn = driver.findElement(By.className("nav-input"));
        searchBtn.click();

        WebElement book = driver.findElement(By.linkText("Selenium Testing Tools Cookbook - Second Edition"));
        book.click();

        String expectedPaperbackPrice = "$44.99";
        WebElement pPrice = driver.findElement(By.xpath("(//span[@class='a-size-base mediaTab_subtitle'])[2]"));
        String actualPPrice = pPrice.getText();

        if (expectedPaperbackPrice.equals(actualPPrice)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("actualPPrice = " + actualPPrice);
            System.out.println("expectedPaperbackPrice = " + expectedPaperbackPrice);
        }

        String expectedKindlePrice = "$22.39";
        WebElement kPrice = driver.findElement(By.xpath("(//span[@class='a-size-base mediaTab_subtitle'])[1]"));
        String actualKindlePrice = kPrice.getText();

        if (expectedKindlePrice.equals(actualKindlePrice)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("actualKindlePrice = " + actualKindlePrice);
            System.out.println("expectedKindlePrice = " + expectedKindlePrice);
        }


        driver.quit();

    }

    /**
     * TS002: Book details
     * 1. Go to amazon.com
     * 2. Search for selenium cookbook
     * 3. verify the first result is Learn Selenium: Build data-driven test frameworks
     * for mobile and web applications with Selenium Web Driver 3
     * 4. Verify the author is Unmesh Gundecha
     */
    private static void bookDetailsTest() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://amazon.com");
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("selenium cookbook");
        WebElement searchBtn = driver.findElement(By.className("nav-input"));
        searchBtn.click();

        String expectedBook = "Learn Selenium: Build data-driven test frameworks " +
                "for mobile and web applications with Selenium Web Driver 3";
        WebElement res1 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
        String actualBook = res1.getText();

        if (expectedBook.equals(actualBook)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("actualBook = " + actualBook);
            System.out.println("expectedBook = " + expectedBook);
        }

        String expectedAuthor = "Unmesh Gundecha";
        WebElement author1 = driver.findElement(By.xpath("(//span[@class='a-size-base'])[2]"));
        String actualAuthor = author1.getText();

        if (expectedAuthor.equals(actualAuthor)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("actualAuthor = " + actualAuthor);
            System.out.println("expectedAuthor = " + expectedAuthor);
        }
        driver.quit();
    }

    /**
     * TS001: Verify Title
     * <p>
     * 1. Go to amazon.com
     * 2. Search for selenium cookbook
     * 3. Click link Books
     * 4. Verify title ends with books
     * 5. Click on any department
     * 6. Verify title does not end with books
     */
    private static void titleTest() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://amazon.com");
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("selenium cookbook");
        WebElement searchBtn = driver.findElement(By.className("nav-input"));
        searchBtn.click();
        WebElement booksLink = driver.findElement(By.linkText("Books"));
        booksLink.click();
        String title = driver.getTitle();
        System.out.println(title);
        if (title.endsWith("Books")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println(title + ": did not end with Books");
        }

        WebElement anyDepartment = driver.findElement(By.linkText("Any Department"));
        anyDepartment.click();

        title = driver.getTitle();
        if (!title.endsWith("Books")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("Actual: " + title);
        }

        driver.quit();
    }
}

