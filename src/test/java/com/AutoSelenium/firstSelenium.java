package com.AutoSelenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class firstSelenium {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("")
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.navigate().to("https://google.com");
        //driver.get("");

        System.out.println(driver.getTitle());


        Thread.sleep(2000);
        driver.quit();
    }

}
