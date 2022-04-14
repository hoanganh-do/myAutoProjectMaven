package com.selenium;

import com.webElement.*;
import com.webElement.LoginPage;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
    public static void main(String[] args) throws Exception {

        //System.out.println("");

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://anhtester.com");

        Thread.sleep(2000);

        //Doi tuong cua WebElement
        //click vao button login
        //button, input, link, drop down, dialog, header_Page<name>,...
        WebElement button_Login = driver.findElement(By.id("btn-login"));
        button_Login.click();
        Thread.sleep(1000);

//        WebElement email = driver.findElement(By.name("email"));
//        email.sendKeys("autotest@mailinator.com");
//        Thread.sleep(1000);
        LoginPage lp = new LoginPage();
        lp.email1.click();


        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123456");
        Thread.sleep(1000);

        WebElement button_LoginAccount = driver.findElement(By.id("login"));
        button_LoginAccount.click();
        Thread.sleep(500);

       /* WebElement link_Posts = driver.findElement(By.partialLinkText("Posts"));
        link_Posts.click();
        WebElement tagNameDiv = driver.findElement(By.tagName("div"));
        tagNameDiv.getText();
        System.out.println(tagNameDiv.getText());
        Thread.sleep(2000);
        WebElement button_DangBaiViet = driver.findElement(By.cssSelector("[style = '']")); //cach 1 hay bi oang
        DangBaiViet.click();
        driver.findElement(By.cssSelector("a[id ='']")).click(); //cach 2 */


        driver.quit();
    }
}
