package actionclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage
{

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(how = How.LINK_TEXT, using = "Contact us")
    private WebElement contactUsButton;
    public void clickOnContactUSButton()
    {
        contactUsButton.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Harsharn Wijewardana')]")
    private WebElement accountpageLabel;
    public String verifyMyAccountLabel()
    {
        return accountpageLabel.getText();
    }
}
