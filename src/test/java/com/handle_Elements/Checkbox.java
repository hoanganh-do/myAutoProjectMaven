package com.handle_Elements;

//import com.initialization.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import com.initialization.*;

public class Checkbox extends Init {

    //static Init init = new Init();

        public static void main(String[] args) throws Exception {
        Setup();
        driver.navigate().to("https://demo.anhtester.com/basic-checkbox-demo.html");
        //driver.findElement(By.xpath("//input[@id = 'isAgeSelected']")).click();

        //Kiểm tra checkbox đã được tick hay chưa
        boolean isSelected = driver.findElement(By.id("isAgeSelected")).isSelected();
        //Nếu chưa được tick thì click vào ô checkbox đó
        if (isSelected == false) {
            System.out.println("Chưa được chọn");
            Thread.sleep(2000);
            driver.findElement(By.id("isAgeSelected")).click();
            Thread.sleep(2000);

            WebElement msgDisplayed = driver.findElement(By.xpath("//div[@id = 'txtAge']"));
            if (msgDisplayed.isDisplayed() == true) {
                System.out.println("Vừa chọn xong");
                System.out.println(msgDisplayed.getText());
            }

        } else {
            System.out.println("Đã được chọn");
        }
        TearDown();
    }


    //Multi checkbox
//    public static void main(String[] args) /*throws Exception*/ {
//        Setup();
//        driver.navigate().to("https://demo.anhtester.com/basic-checkbox-demo.html");
//        WebElement buttonLabel = driver.findElement(By.xpath("/input[@id=\"check1\"]"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",buttonLabel);
//        if (buttonLabel.getAttribute("value").trim().toString().equals("Check nAll")) {
//            buttonLabel.click();
//        } else {
//            System.out.println("Không phải text");
//        }
        //ham trim() dùng để cắt 2 khoảng trắng đầu và đuôi
        //hàm toString() dùng để chuyển giá trị lấy được từ getAttribute về dạng chuỗi
        //hàm equals() so sánh bằng
        //Cach 1
        /*WebElement Checkbox1 = driver.findElement(By.xpath("/input[@id = 'check1']"));
        WebElement Checkbox2 = driver.findElement(By.xpath("/input[@id = 'check1']"));
        if (Checkbox1.isSelected() == true && Checkbox2.isSelected() == true) {
            System.out.println("Đã được chọn hết");
        } else {
            System.out.println("Sai. Chưa được chọn hết");
        } */

        /*//Cach 2
        var listCheckbox  = driver.findElements(By.xpath("/input[@id = 'check1']"));
        System.out.println(listCheckbox.size());
        for (int i = 1; i < listCheckbox.size(); i++) {
            WebElement Checkbox = driver.findElement(By.xpath("//div[@id = 'easycont']/div[1]/div[2]/div[2]/div[" + i + "]/label[1]/"));
            if (Checkbox.isSelected() == true) {
                System.out.print("checkbox thứ "+i+" đã được chọn");
            } else {
                System.out.print("checkbox thứ \"+i+\" chưa được chọn");
            }
        } */



 //   }




}

