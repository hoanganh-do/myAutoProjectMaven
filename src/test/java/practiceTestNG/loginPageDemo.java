package practiceTestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class loginPageDemo extends basePageDemo {

    @Test (priority = 1)
    public void LoginToWeb() {
        driver.navigate().to("https://anhtester.com");
        driver.findElement(By.xpath("//a[@id = 'btn-login']")).click();
        driver.findElement(By.xpath("//*[@id=\"style-7\"]/section[2]/div/div/div/div/div[2]/div/form/div/div[1]/div/div/input")).sendKeys("thaian.it15@gmail.com");
        driver.findElement(By.xpath("//a[@id = 'btn-login']")).sendKeys();
        driver.findElement(By.xpath("//a[@id = 'btn-login']")).click();
    }

    @Test (priority = 3)
    public void AddPost() {
        driver.findElement(By.xpath("//a[@id = 'btn-login']")).click();
    }

    @Test (priority = 2)
    public void OpenPostManagement() {
        driver.findElement(By.xpath("//a[@id = 'btn-login']")).click();
    }


}
