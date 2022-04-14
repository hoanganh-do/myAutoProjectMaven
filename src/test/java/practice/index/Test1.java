package practice.index;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import practice.utilities.*;

import org.testng.annotations.Test;

public class Test1 extends setupBrowser  {


    @Test
    public void loginToHRMSystem() {
        driver.get(objHRM.url);
        //helperWait.delay(2);

        driver.findElement(objHRM.usernameInput).sendKeys("admin01");
        driver.findElement(objHRM.passwordInput).sendKeys("123456");
        driver.findElement(objHRM.loginButton).click();
        helperWait.delay(2);

        //driver.findElement(objHRM.menuDuAn).click(); thay bằng hàm dưới đây để làm ngắn gọn và rõ ràng code//Wait and Click
        hpwait.clickToElement(objHRM.menuDuAn);
        hpwait.clickToElement(objHRM.themMoiButton);
        hpwait.setText(objHRM.tieuDeInput, "Dự án 01");
        hpwait.clickToElement(objHRM.khachHangDropdown);
        hpwait.setText(objHRM.khachHangInput, "Client 02");
        //Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();
        hpwait.setText(objHRM.gioUocTinhInput, "5");
        hpwait.clickToElement(objHRM.priorityDropdown);
        //helperWait.delay(2);
        hpwait.setText(objHRM.priorityInput, "Cao");
        //helperWait.delay(2);
        actions.sendKeys(Keys.ENTER).build().perform();
        //helperWait.delay(2);
        hpwait.clickToElement(objHRM.startDateInput);
        //helperWait.delay(4);
        driver.findElement(By.xpath("//a[contains(text(),'10')]")).click();
        hpwait.clickToElement(objHRM.oKStartDateBtn);


        helperWait.delay(2);

    }

}
