package com.initialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Init {
    public static WebDriver driver = null; //them tu khoa public vao day de ben package Checkbox co the goi duoc cai driver

    public static void Setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SeleniumJava\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


    public static void TearDown() /*throws Exception*/ {
        //Thread.sleep(2000);
        driver.quit();
    }
}
