package POM.testcases;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import POM.base.baseSetup;
import POM.pages.signInPage;
import POM.pages.signInPageFactory;
import POM.pages.dashBoardPageFactory;

public class signInTest extends baseSetup {

    private WebDriver driver;
    public signInPage signInPg;
    public signInPageFactory signInPgFtr;
    public dashBoardPageFactory dashBoPgFtr;
    //public documentPage docPg;

    @BeforeClass
    public void setUp() {
        //Đã khởi tạo browser hết rồi kể cả wait, phóng to màn hình,...
        driver = getDriver();
    }

    @Test(priority = 1)
    public void signIn() throws Exception {
        //System.out.println(driver);
        //signInPg = new signInPage(driver);
        signInPgFtr = new signInPageFactory(driver);

        Assert.assertTrue(signInPgFtr.verifySignInPageTitle(), "Sign In page title doesn't match");
        Assert.assertTrue(signInPgFtr.verifySignInPageText(), "Header page text not matching");


        //Chỗ này gán hàm signin cho đối tượng dashBoardPageFactory luôn vì hàm signin trả về
        //1 khởi tạo trang dashBoard và đã có mang driver đi cùng luôn rồi
        //dashBoPg = signInPg.signin("thaian@mailinator.com", "Demo@123", "123456");
        //signInPgFtr = new signInPageFactory(driver);
        dashBoPgFtr = signInPgFtr.signin("thaian@mailinator.com", "Demo@123", "123456");
    }

//    public void openDocument() {
//        //dashBoPg = new dashBoardPageFactory(driver);
//        Assert.assertTrue(dashBoPg.verifySignInPageTitle(), "Dashboard page title doesn't match");
//        docPg = dashBoPg.openDocumentManagement();
//    }

}