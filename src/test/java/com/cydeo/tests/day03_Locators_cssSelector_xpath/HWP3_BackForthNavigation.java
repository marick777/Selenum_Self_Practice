package com.cydeo.tests.day03_Locators_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP3_BackForthNavigation {
    public static void main(String[] args) {


        //TC #3: Back and forth navigation
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://google.com

        driver.get("https://google.com");


        //3- Click to Gmail from top right.
        //Locating the Gmail link with "xpath" locator
        //tagName[@attribute='value']
        // WebElement gmailButton = driver.findElement(By.xpath("//a[href='https://mail.google.com/mail/&ogbl']"));



        //Using the text of the element with "xpath" locator
        //tagName[text()='textValue'] --> //tagName[.='textValue']
        // WebElement gmailButton = driver.findElement(By.xpath("//a[text()='Gmail']"));
        //WebElement gmailButton = driver.findElement(By.xpath("//a[.='Gmail']"));

        //Locating the Gmail link with "cssSelector" locator
        // tagName[attribute='value']
        WebElement gmailButton = driver.findElement(By.cssSelector("a[href='https://mail.google.com/mail/&ogbl']"));



        gmailButton.click();


        // 4- Verify title contains:
        //Expected: Gmail

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title text verification PASSED!!! "+actualTitle);
        }else {
            System.err.println("Title text verification FAIL!!! "+actualTitle);
        }


        //5- Go back to Google by using the .back();

        driver.navigate().back();


        // 6- Verify title equals:
        //Expected: Google

        expectedTitle = "Google";
        actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title text verification PASSED!!! "+actualTitle);
        }else {
            System.err.println("Title text verification FAIL!!! "+actualTitle);
        }

        driver.close();

    }
}
