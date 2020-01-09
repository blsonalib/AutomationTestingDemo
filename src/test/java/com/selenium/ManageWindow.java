package com.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().getPosition();
        driver.get("https://www.google.com");
        Dimension dimension = driver.manage().window().getSize();
        System.out.println(dimension.height);
        System.out.println(dimension.width);
        Point point = driver.manage().window().getPosition();
        System.out.println("X-position"+point.x);
        System.out.println("Y-Position"+point.y);
        Dimension newDimention = new Dimension(100,900);
        driver.manage().window().setSize(newDimention);
        Point newPoint = new Point(10,20);
        driver.manage().window().setPosition(newPoint);

    }
}
