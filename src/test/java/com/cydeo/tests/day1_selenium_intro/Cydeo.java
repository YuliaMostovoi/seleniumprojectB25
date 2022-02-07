package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cydeo {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com ");

        String currentTitle = driver.getTitle();
        String expectedTitle = "Practice";

        if(expectedTitle.equals(currentTitle)){
            System.out.println("Test passed!");
        }else{
            System.out.println("Not passed!");
        }

        if(driver.getCurrentUrl().contains("cydeo")){
            System.out.println("Test passed!");
        }else{
        System.out.println("Not passed!");
    }
        driver.close();


    }

}
