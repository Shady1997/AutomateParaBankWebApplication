package test_cases;

import com.example.pages.PageBase;
import com.example.pages.P01_LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_CheckLogin extends TestBase{
    // define page object
    P01_LoginPage loginPage;


    @Test(priority = 3,groups = "smoke",description = "Login Para Bank with Valid Credientials")
    private void login() throws InterruptedException {
        loginPage=new P01_LoginPage(driver);

        loginPage.userName.sendKeys("john");

        loginPage.userPassword.sendKeys("demo");

        loginPage.loginButton.click();

        // verify successful login with valid username and password
        Assert.assertEquals(driver.getPageSource().contains("Accounts Overview"), true);

        // take screenshot after successful login
        PageBase.captureScreenshot(driver,"homePage");
    }
}
