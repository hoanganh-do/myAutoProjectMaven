package practice.utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class helperWait {

    WebDriver driver;

    public helperWait(WebDriver _driver) {
        this.driver = _driver;
    }


    public static void delay(int second) {
        try {
            Thread.sleep(second * 1000); //để chuyển từ mms sang s
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickToElement(By by) {
        //Set timeout cho WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //Wait to click
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        //Click
        driver.findElement(by).click();
    }

    public void setText(By by, String value) {
        //Set timeout cho WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //Wait to click
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        //Input value into field
        driver.findElement(by).sendKeys(value);
    }





}

