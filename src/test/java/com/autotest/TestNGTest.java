package com.autotest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNGTest {

    WebDriver driver; //mang de len tren class de no tro thanh bien toan cuc

    @Test(priority = 2)
    public void Test01() {         //moi ham la mot cai testcase, vi du day la testcase01

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://anhtester.com");

        driver.quit();

    }

    @Test
    public void Test02() {         //moi ham la mot cai testcase, vi du day la testcase02

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://google.com");

        driver.quit();

    }


}
//neu muon chay ham nao thi click chuot duoi ham do hoac la click vao nut mui ten mau xanh phia ben trai
//con neu muon chay ca hai hoac nhieu ham hon thi click chuot vao vung trong cua class ko nam trong vung cua cac ham hoac click vao mui ten mau xanh o ben trai tai class thi se chay ca hai ham cua ca class nay, luu y la chay tuan tu theo thu tu con chay song song thi o mot bai khac
//tu khoa priority de uu tien thang nao dc chay truoc