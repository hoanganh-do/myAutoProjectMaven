package frameworkTestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class testngClass1 {

    public WebDriver driver = null;

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SeleniumJava\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }


    @Test
    public void Demo1() {
        driver.navigate().to("https://anhtester.com");

    }
    @Test
    public void Demo2() {
        driver.navigate().to("https://google.com");

    }
    @Test
    public void Demo3() {
        driver.navigate().to("https://devforum.info");

    }


    @AfterTest
    public void afterTest() throws Exception {
            Thread.sleep(2000);
            driver.quit();
    }
}
