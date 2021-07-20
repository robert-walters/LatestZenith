package PageObjects.Sprint35;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_URLLinksToSharePointPermanentPage extends BasePage {

    @FindBy(xpath = "//div[@data-testid='outcome']")
    @CacheLookup
    public WebElement txtOutcome;

    @FindBy(xpath = "//span[contains(text(), 'Rejected')]")
    @CacheLookup
    public WebElement txtOutcome_item;

    @FindBy(xpath = "//button[@data-testid='testIdSubmit']")
    @CacheLookup
    public WebElement btnSave;

    @FindBy(xpath = "//a[contains(text(), 'email template')]")
    @CacheLookup
    public WebElement lnkEmailTemplate;

    public FE_URLLinksToSharePointPermanentPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
