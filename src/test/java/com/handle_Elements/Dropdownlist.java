package com.handle_Elements;

//import com.initialization.Init;

import com.initialization.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Dropdownlist extends Init {

    //Dropdown tĩnh
    public static void main(String[] args) /*throws Exception*/ {
        Setup();
        driver.navigate().to("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        //Lấy element của thẻ "select" html
        WebElement element = driver.findElement(By.xpath("/input[@value = '5 - 15']"));
        //Khai báo đối tượng kiểu Select cho element trên
        Select selectDropdown = new Select(element);
        selectDropdown.isMultiple();
        //Kiểm tra số lượng thẻ option
        System.out.println(selectDropdown.getOptions().size());
        //Kiểm tra giá trị của option đã được chọn
        System.out.println(selectDropdown.getFirstSelectedOption().getText());
        if (selectDropdown.getFirstSelectedOption().getText() == "Friday") {
            System.out.println("Đúng");
        } else {
            System.out.println("Sai");
        } //hoặc dùng tính kế thừa để viết kiểu khác: validate.checkText(selectDropdown.getFirstSelectedOption(), "Tuesday"); khi tạo 1 package Validate có class và hàm checkText




        //Lấy ra các giá trị trong dropdown
        List<WebElement> getAllOptions = selectDropdown.getOptions();
        ArrayList<WebElement> getAllOptions2ArrayList = (ArrayList<WebElement>) selectDropdown.getOptions();
        for (int i = 0; i < getAllOptions.size(); i++) {
            System.out.println(getAllOptions.get(i).getText());
        }

        //Dropdown động
        WebElement selectCountryElement = driver.findElement(By.xpath("/span[normalize-space() = 'Select a country']"));
        selectCountryElement.click();
        WebElement inputCountryElement = driver.findElement(By.xpath("/span[normalize-space() = 'Select a country']"));
        inputCountryElement.sendKeys("Vietnam");
       //rồi khai báo đối tượng thuộc lớp Actions để handle trực tiếp keyboard của bàn phím máy tính
        Actions action = new Actions(driver);
        //Hàm build để xây dựng hành động cho action, hàm perform để xác nhận xây dựng đó
        action.sendKeys(Keys.ENTER).build().perform();





    }


}






