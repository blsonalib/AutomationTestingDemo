package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;

public class Keyboard_Mouse_Operation {
    public static void main(String[] args) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Robot robot = new Robot();
        robot.mouseMove(300,500);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        //robot.keyPress(KeyEvent.VK_W);
        Thread.sleep(1000);
    }
}
