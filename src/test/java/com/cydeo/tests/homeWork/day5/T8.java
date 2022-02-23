package com.cydeo.tests.homeWork.day5;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T8 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //TC #8: Selecting value from multiple select dropdown
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @Test
    public void test() throws InterruptedException {

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
        //3. Select all the options from multiple select dropdown.

        Select multiSelectDropDown = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        multiSelectDropDown.selectByVisibleText("JavaScript");
        multiSelectDropDown.selectByValue("java");

        multiSelectDropDown.selectByVisibleText("Ruby");
        multiSelectDropDown.selectByIndex(4);
        multiSelectDropDown.selectByValue("c");
        multiSelectDropDown.selectByValue("c#");
        //4. Print out all selected values.
        //5. Deselect all values.
        multiSelectDropDown.deselectByIndex(0);
        multiSelectDropDown.deselectByValue("js");
        multiSelectDropDown.deselectByVisibleText("C#");
        multiSelectDropDown.deselectByValue("python");
        multiSelectDropDown.deselectByIndex(4);
        multiSelectDropDown.deselectByVisibleText("C");
        //
        Thread.sleep(2000);
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }



}
