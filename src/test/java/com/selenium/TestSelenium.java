package com.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.text.Position;
import java.io.File;
import java.io.IOException;

public class TestSelenium {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.journaldev.com/26429/selenium-webdriver");
        driver.navigate().forward();
        driver.navigate().back();
        String pageResource=driver.getPageSource();
        System.out.println(pageResource);
        String title = driver.getTitle();
        System.out.println("title of google:"+title);
        String url = driver.getCurrentUrl();
        System.out.println("Current Url : "+url);
        driver.close();
    }
}
