/*package Alert_Popup_Iframe;

public class Popup {


    @Test
    public void AlertDemo() {
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).submit();

        // Khai báo chuyển hướng đến Alert với đối tượng
        Alert alert = driver.switchTo().alert();

        // Get message trên alert
        String alertMessage = driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);

        // .accept() = nhấn OK button
        // .driver.switchTo().alert().accept(); //Cách 1
        //alert.accept(); //Cách 2

        //Nhấn Cancel button
        //alert.dismiss();


        //alert.sendKeys("Tester");
        //alert.accept();
        //hoặc alert.dimiss();


        //Assert.assertEquals(driver.findElement...().getText(), "You have entered 'Tester' !");
        //Assert.assertFalse(driver.findElement...().isDisplayed());

    }
} */