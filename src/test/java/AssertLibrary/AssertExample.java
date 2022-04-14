package AssertLibrary;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.initialization.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import practiceTestNG.Annotation;
import practiceTestNG.*;

public class AssertExample extends basePageDemo {

    @Test
    public void UpdateProfile() {

        driver.navigate().to("https://anhtester.startkatalyst.com/accoount/sign-in");
        driver.findElement(By.xpath("//a[@id = 'btn-login']")).click();
        driver.findElement(By.xpath("//a[@id = 'btn-login']")).click();


        WebElement headerEditInformation = driver.findElement(By.xpath("//a[@id = 'btn-login']"));
        assertEquals(headerEditInformation.getText(), "Edit Personal Information");
        assertTrue(headerEditInformation.getText().contains("Edit Personal"));

        driver.findElement(By.xpath("//input[@id = 'LastName']")).clear();
        driver.findElement(By.xpath("//input[@id = 'LastName']")).sendKeys("Employee");




        basePageDemo demo = new basePageDemo();
        demo.Setup();







    }
}
