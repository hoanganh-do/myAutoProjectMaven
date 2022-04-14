package seleniumWait;

import com.initialization.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Wait extends Init {

//    @Test
//    public void ExplicitWait() {
//        Init init = new Init();
//        init.Setup();
//        driver.get("https://anhtester.com/");
//        //Set timeout
//        WebDriverWait wait = new WebDriverWait(driver, 2);
//        //Click nút đăng nhập
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-login")));
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-login")));
//        driver.findElement(By.id("btn-login")).click();
//        //Điền thông tin vào textbox
//        driver.findElement(By.xpath("//input[@placeholder = 'Email']")).sendKeys("");
//        driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("");
//        //dùng wait để đợi 2s cho đến khi nút đăng nhập ấn được
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-login")));
//        //Đợi tiếp 2s cho câu lệnh tìm thông tin menu bên trái
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class = 'sidenav_item']//a[contains(text(),'Posts')]")));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class = 'sidenav_item']//a[contains(text(),'Posts')]")));
//        driver.findElement(By.xpath("//li[@class = 'sidenav_item']//a[contains(text(),'Posts')]")).click();


//        //Click menu dự án
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Website Testing')]")));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'Website Testing')]")));
//        driver.findElement(By.xpath("//h3[contains(text(),'Website Testing')]")).click();


//<-- hoặc là mai sau tối ưu code thì sẽ viết 1 hàm và dùng theo kiểu này, không còn cần viết hàm wait nhiều lần
// ở mỗi một câu lệnh nữa mà sẽ tái sử dụng  -->



/*
    public void FluentWait() {
        driver.get("https://anhtester.com/");
        WebElement element1 = driver.findElement(By.xpath(""));
        WaitAndClick(element1, 5);

        WebElement element2 = driver.findElement(By.xpath(""));
        WebElement element3 = driver.findElement(By.xpath(""));
        WaitAndClick(element3, 10);
    }


    public void WaitAndClick(WebElement element, int timeout) {
        WebDriverWait wait  = new WebDriverWait(driver, timeout);

        wait.until(ExpectedConditions.elementToBeClickable(element));

        element.click();
    }
*/


}











//ImplicitWait "đợi ngầm định" luôn tìm kiếm element trong 1 khoảng thời gian ngầm định, ví dụ là trong 30s thì trong tối đa 30s đó sẽ luôn tìm kiếm
//cái phần tử đó, nếu trường hợp tìm thấy thì tiếp tục câu lệnh còn nếu ko tìm thấy thì vẫn phải đợi đủ hết 30s thì mới văng ra câu lệnh báo lỗi
//ExplicitWait "cố tình đợi", đợi đủ thời gian thì văng ra lỗi Exception nhưng nó áp dụng cho từng cái dòng lệnh tìm kiếm Element chứ không áp dụng
//cho tất cả các câu lệnh (cái này thì còn cần đáp ứng được một điều kiện cụ thể)
//FluentWait