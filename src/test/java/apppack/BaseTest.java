package apppack;

import com.maxsoft.webdrivermanager.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static utils.Driver.getDriver;
import static utils.Driver.setDriver;

public class BaseTest
{
    protected WebDriver driver;

    @BeforeMethod
    public void before()
    {
        setDriver(DriverFactory.HEADLESS_CHROME);
        driver = getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @AfterMethod
    public void closeDriver()
    {
        driver.quit();
    }
}
