package com.cydeo.tests.day03_Locators_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP4_LocatorPractice {
    public static void main(String[] args) {

        //TC #4: Practice Cydeo – Class locator practice
        // 1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://practice.cydeo.com/inputs

        driver.get("https://practice.cydeo.com/inputs");

        // 3- Click to “Home” link
        //PS: Locate “Home” link using “xpath” locator

        //WebElement homeButton = driver.findElement(By.xpath("//a[@class='nav-link']"));

        //Using the text of the element with "xpath" locator
        //tagName[text()='textValue'] --> //tagName[.='textValue']
        //WebElement homeButton = driver.findElement(By.xpath("//a[text()='Home']"));

        //Locate “Home” link using “cssSelector” locator
        //WebElement homeButton = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeButton = driver.findElement(By.cssSelector("a.nav-link"));



        homeButton.click();


        //4- Verify title is as expected:
        // Expected: Practice

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title text verification PASSED!!! "+actualTitle);
        }else {
            System.err.println("Title text verification FAIL!!! "+actualTitle);
        }

        driver.close();


    }
}