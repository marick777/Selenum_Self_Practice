package com.cydeo.tests.day02_practice;

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

        WebElement gmailButton = driver.findElement(By.className("gb_n"));
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
