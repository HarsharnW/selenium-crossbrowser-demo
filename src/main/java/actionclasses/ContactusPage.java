package actionclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactusPage extends BasePage{

    public ContactusPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(),'//h1[contains(text(),'Customer service - Contact us')]')]")
    private WebElement contactuspageLabel;
    public String verifyContactUsPageLabel()
    {
        return contactuspageLabel.getText();
    }
}
