package com.webElement;


import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;


public class Practice {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //Set thoi gian cho ngam dinh 10s cho tat ca cac step
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://anhtester.com");
        //Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@id = 'btn-login']")).click();
        driver.findElement(By.xpath("//input[@placeholder = 'Email']")).sendKeys("autotest@mail.com");
        driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()-'login account']")).click();
        driver.findElement(By.partialLinkText("Posts")).click();
        boolean headerPost = driver.findElement(By.xpath("//h1[@class = 'text-primary']")).isDisplayed();
        //dung kieu du lieu true/false de luu gia tri check cai header co hien thi hay khong, gia tri tra ve la boolean thi phai luu vao mot cai bien co gia tri la boolean
        if (headerPost == true) {
            System.out.println("Go to page 'Post' success");
        }

        boolean buttonAddPost = driver.findElement(By.xpath("//a[@id = 'btn-dangbai']")).isEnabled();
        if (buttonAddPost == true) {
            driver.findElement(By.xpath("//a[@id = 'btn-dangbai']")).click();
        } else {
            System.out.println("Cannot click on this button ");
        }




        Thread.sleep(2000);
        driver.quit();




    }

}
