package com.webDriver;


import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class Practice_Phan2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
        //Thread.sleep(2000);


        driver.findElement(By.xpath("//input[@id = 'btnLogin']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space() = 'Admin']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space() = 'User Management']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space() = 'Users']")).click();
        Thread.sleep(1000);
        boolean headerPost = driver.findElement(By.xpath("//h1[@class = 'text-primary']")).isDisplayed();

        //Lay tat ca cac doi tuong la the th trong bang table <table-tbody-tr-th-td>
        List<WebElement> thList = driver.findElements(By.xpath("//th"));
        List<WebElement> i_thList = driver.findElements(By.xpath("//th/i"));

        for (int i = 0; i < thList.size(); i++) {
            //Chay tu 0 cho den be hon do dai cua cai List tren
            //Va in ra gia tri cua text cua the th (the th trong table)
            //System.out.println(thList.get(i).getText());

        }
        //tim 1 element trong 1 cai khung frame tren website
        driver.switchTo().frame(1);

        //Thread.sleep(1000);
        System.out.println("Run successfully");
        driver.close();
    }

}

