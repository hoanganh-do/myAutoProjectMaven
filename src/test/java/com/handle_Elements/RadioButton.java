package com.handle_Elements;

import com.initialization.Init;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class RadioButton extends Init {

    //Multi radio
    public static void main(String[] args) /*throws Exception*/ {
        Setup();
        driver.navigate().to("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement radio_Age_5to15 = driver.findElement(By.xpath("/input[@value = '5 - 15']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radio_Age_5to15);

        radio_Age_5to15.click();

        WebElement button_getValues = driver.findElement(By.xpath("/input[@value = '5-15']"));

        button_getValues.click();

        WebElement text_Age_Value = driver.findElement(By.xpath("/input[@value = '5-15']"));

        System.out.println(text_Age_Value.getText());
        if (text_Age_Value.getText().contains("Age group: 5 - 15")) { // sau dấu == là data mà mình đã phải biết trước để so sánh (có thể là lấy từ db)
            System.out.println("Đúng");
        } else {
            System.out.println("Sai");
        }

    }


}






