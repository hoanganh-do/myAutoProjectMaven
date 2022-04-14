package UserInteractions;

import com.initialization.*;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.ThreadLocalRandom;


public class ActionsClass extends Init {

//    @Test
//    public static void ActionsFunction() {
//        Init init = new Init();
//        init.Setup();
//
//
//        driver.get("https://google.com");
//        //specify the locator of the search-box
//        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
//        //create an object for the Actions class and pass the driver argument
//        Actions action = new Actions(driver);
//        //pass the product name that has to be searched in website
//        action.sendKeys(element, "Tester").sendKeys(Keys.ENTER).build().perform();
//        //action.sendKeys(Keys.ENTER).build().perform();
//        //Single click
//        WebElement testerTitleElement = driver.findElement(By.xpath(""));
//        testerTitleElement.click();
//        //Double click là click chuột trái
//        WebElement headerHomePage = driver.findElement(By.xpath(""));
//        action.doubleClick(headerHomePage).build().perform();
//        //movetoElement
//        WebElement buttonDangKy = driver.findElement(By.xpath(""));
//        action.moveToElement(buttonDangKy).build().perform();
//        //contextClick là clcik chuột phải
//        action.contextClick(buttonDangKy);
//
//        init.TearDown();
//    }

    @Test
    public void DragAndDrop() throws Exception {

        Init init = new Init();
        init.Setup();

        driver.get("http://demo.guru99.com/test/drag_drop.html");
        //element which needs to drag
        WebElement From = driver.findElement(By.xpath("//*[@id = 'credit2']/a"));
        //element which needs to drop
        WebElement To = driver.findElement(By.xpath("//*[@id = 'bank']/li"));

        Actions action = new Actions(driver);
        Thread.sleep(1000);
        //dragged and dropped
        action.dragAndDrop(From,To).build().perform();
    }
}
