package PageObjects.Sprint39;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_Job_ChangeMainClientContactPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'HR contacts')]")
    @CacheLookup
    public WebElement btnClientContactType;

    @FindBy(xpath = "//button[@data-testid='dropdown']//span[contains(text(), 'Main contact')]")
    @CacheLookup
    public WebElement btnClientContactTypeItem;


    public FE_Job_ChangeMainClientContactPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
