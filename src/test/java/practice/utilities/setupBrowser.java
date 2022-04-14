package practice.utilities;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import practice.index.objectHRM;

import java.util.concurrent.TimeUnit;

public class setupBrowser {

    public WebDriver driver;
    public JavascriptExecutor js;
    public helperWait hpwait;
    public objectHRM objHRM;
    public Actions actions;

    @BeforeClass
    public void createDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("Start Driver");
        driver.manage().window().maximize();
//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        js = (JavascriptExecutor) driver;
        hpwait = new helperWait(driver);
//        Khởi tạo đối tượng cho class objectHRM để gọi từng object qua dùng lại
        objHRM = new objectHRM();
        actions = new Actions(driver);


    }

    @AfterClass
    public void quitDriver() {
        driver.quit();
        System.out.println("Quit Driver");
    }



}
