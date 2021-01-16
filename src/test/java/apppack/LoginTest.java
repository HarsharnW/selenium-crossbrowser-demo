package apppack;

import actionclasses.HomePage;
import actionclasses.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest
{
    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeMethod
    public void beforeLogin()
    {
        loginPage = PageFactory.initElements(driver,LoginPage.class);
        homePage = PageFactory.initElements(driver,HomePage.class);
    }

    @Test
    public void verifyValidLogin()
    {
        loginPage.setEmail("harsharnsoffice2@gmail.com");
        loginPage.setPassword("eve20000");
        loginPage.clickOnSignInButton();
        Assert.assertEquals(homePage.verifyMyAccountLabel(),"Harsharn Wijewardana");
    }

    @Test
    public void verifyInvalidLogin()
    {
        loginPage.setEmail("abc@gmail.com");
        loginPage.setPassword("eve20000");
        loginPage.clickOnSignInButton();
        Assert.assertEquals(driver.getTitle(),"Login - My Store");
    }
}
