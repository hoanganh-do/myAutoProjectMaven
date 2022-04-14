package POM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signInPageFactory {

    private WebDriver driver;

    //Explicit wait chờ đợi rõ ràng cho từng lần tìm kiếm element
    private WebDriverWait wait;

    @FindBy(xpath = "//a[normalize-space()='Forgot Username/Password?']")
    private WebElement headerPageText;

    @FindBy(id = "EmailInputEmail")
    private WebElement emailInput;

    @FindBy(id = "PasswordInputPassword")
    private WebElement passwordInput;

    @FindBy(id = "SignInButton")
    private WebElement signinBtn;

    @FindBy(id = "signInError")
    private WebElement errorMsgText;

    @FindBy(id = "Pin")
    private WebElement pinInput;
    @FindBy(id = "RequestPinForm_SubmitButton")
    private WebElement submitBtn;
    @FindBy(id = "RequestPinForm_Back")
    private WebElement backBtn;
    @FindBy(id = "RequestPinForm_ResetPin")
    private WebElement resetPintBtn;

    // Khởi tạo class khi được gọi và truyền driver vào để các thành phần trong
    // Và khởi tạo initElements
    public signInPageFactory (WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 5);
        PageFactory.initElements(this.driver, this); //cái này là cú pháp bắt buộc phải có
    }

    /*// Chúng ta viết hàm signin không cần dùng các hàm bổ trợ enter hay click nữa
    public void signin(String username, String password, String Pin) throws Exception {
        inputText(emailInput,username);//emailInput.sendKeys(username);
        inputText(passwordInput, password);//passwordInput.sendKeys(password);
        clickElement(signinBtn);//signinBtn.click();
        inputText(pinInput, Pin);//pinInput.sendKeys(Pin);
        clickElement(submitBtn);//submitBtn.click();
    }*/
    //Chúng ta viết hàm signin không cần dùng các hàm bổ trợ enter hay click nữa, thay void bằng kiểu trả về là một class khác để tạo liên kết giữa các page trong POM
    public dashBoardPageFactory signin(String username, String password, String Pin) throws Exception {
        inputText(emailInput,username);//emailInput.sendKeys(username);
        inputText(passwordInput, password);//passwordInput.sendKeys(password);
        clickElement(signinBtn);//signinBtn.click();
        inputText(pinInput, Pin);//pinInput.sendKeys(Pin);
        clickElement(submitBtn);//submitBtn.click();

        return new dashBoardPageFactory(driver);
    }

    public boolean verifySignInPageTitle() {
        String expectedTitle = "Sign In";
        return driver.getTitle().equals(expectedTitle);
    }

    public boolean verifySignInPageText() {
        String pageText = headerPageText.getText();
        String expectedPageText = "Forgot Username/Password?";
        return pageText.contains(expectedPageText);
    }



    //Hôm nay rảnh quá  viết được hai hàm chung đó là sendKys và click chung
    public void inputText(WebElement element, String valueText) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(valueText);
    }

    public void clickElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }











}