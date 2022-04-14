package Alert_Popup_Iframe;

import com.initialization.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class handleIframe extends Init {

    @Test
    public void IframeDemo() {
        Init init = new Init();
        init.Setup();
        driver.get("https://anhtester.com/contact");

        int frameTotal = driver.findElements(By.tagName("iframe")).size();
        System.out.println(frameTotal);

        //Chuyển đến frame nào đó theo thứ tự
        driver.switchTo().frame(0); //bắt đầu tính từ 0
        //Chuyển đến frame nào đó theo ID/Name
        //driver.switchTo().frame("dialog-frame");

        WebElement element = driver.findElement(By.tagName("strong"));
        System.out.println(element.getText());
    }
}

