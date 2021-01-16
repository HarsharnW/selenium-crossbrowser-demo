package actionclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage
{

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(how = How.ID, using = "email")
    private WebElement emailTextBox;
    public void setEmail(String email)
    {
        emailTextBox.sendKeys(email);
    }

    @FindBy(how = How.ID, using = "passwd")
    private WebElement passwordTextBox;
    public void setPassword(String password)
    {
        passwordTextBox.sendKeys(password);
    }

    @FindBy(how = How.XPATH, using = "//p[@class='submit']//span[1]")
    private WebElement signInButton;
    public void clickOnSignInButton()
    {
        signInButton.click();
    }
}
