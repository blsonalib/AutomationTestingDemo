package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/login?return_to=%2Fjoin");
        driver.findElement(By.id("login_field")).sendKeys("blsonalib");
        driver.findElement(By.id("password")).sendKeys("bridgelabz19");
        driver.findElement(By.name("commit")).click();
    }
}
