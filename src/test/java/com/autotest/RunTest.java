package com.autotest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunTest {

    public static void main(String[] args) {
        System.out.println("Hello world");

        WebDriver driver;
        WebDriverManager.chromedriver().setup();  //gọi phiên bản của browser
        driver = new ChromeDriver();  //khởi tạo giá trị cho browser

        driver.get("https://anhtester.com");
    }
}
