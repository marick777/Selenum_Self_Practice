package com.cydeo.tests.day02_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP2_zeroBank_Header {
    public static void main(String[] args) {

        //HWP #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html

        driver.get("http://zero.webappsecurity.com/login.html");


        // 3. Verify header text
        //Expected: “Log in to ZeroBank”

        WebElement header = driver.findElement(By.tagName("h3"));

        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderTest = header.getText();

        if(actualHeaderTest.equals(expectedHeaderText)){
            System.out.println("Title text verification PASSED!!!");
        }else {
            System.err.println("Title text verification FAIL!!!");
        }

        driver.close();


    }
}
