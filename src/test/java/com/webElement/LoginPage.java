package com.webElement;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLInputElement;

//public class LoginPage {
//
//
//    public HTMLInputElement email1;
//
//    public static void main(String[] args) {
//        WebDriver driver;
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//
//        WebElement email1 = driver.findElement(By.name("email")); //khi ma dung theo tinh ke thua giua hai package thi vi du se sang package selenium roi import package loginpage vao roi, them tu khoa extends vao <ten_class> sau do roi chi viec dung cu phap <ten_bien>.<ten_ham) la xong
//        WebElement email2 = driver.findElement(By.xpath("//div[@class='col-sm-5']"));
//    }
//}

public class LoginPage {
    WebDriver driver = new ChromeDriver();;
    public WebElement email1 = driver.findElement(By.name("email"));
}