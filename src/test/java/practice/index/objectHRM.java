package practice.index;

import org.openqa.selenium.By;

public class objectHRM {

    //Khai báo url cố định
    public String url = "https://hrm.anhtester.com/";

    //Lưu object với đối tượng By của Selenium
    //By ten_object = By.xpath(""); //câu mẫu
    By usernameInput = By.id("iusername");  //Khai báo một object là một đối tượng trên web UI với kiểu tìm kiếm tương ứng
    By passwordInput = By.id("ipassword");
    By loginButton = By.xpath("//button[@type = 'submit']");
    By menuDuAn = By.xpath("//span[contains(text(), 'Dự án')]");
    By menuTrangChu = By.xpath("//span[contains(text(), 'Trang chủ')]");
    By menuTasks = By.xpath("//span[contains(text(), 'Tasks')]");
    By themMoiButton = By.xpath("//a[contains(normalize-space(), 'Thêm mới')]");
    By tieuDeInput = By.xpath("//input[@placeholder = 'Tiêu đề']");
    By khachHangDropdown = By.xpath("//span[@id='select2-client_id-container']");
    By khachHangInput = By.xpath("/html[1]/body[1]/span[1]/span[1]/span[1]/input[1]");
    By gioUocTinhInput = By.name("budget_hours");
    By priorityDropdown = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[4]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/span[1]/span[1]/span[1]");
    By priorityInput = By.xpath("/html[1]/body[1]/span[1]/span[1]/span[1]/input[1]");
    By startDateInput = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[4]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/input[1]");
    By oKStartDateBtn = By.xpath("/html[1]/body[1]/div[9]/div[1]/div[2]/button[4]");

}
