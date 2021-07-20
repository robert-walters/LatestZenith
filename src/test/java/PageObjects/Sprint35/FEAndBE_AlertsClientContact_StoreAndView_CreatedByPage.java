package PageObjects.Sprint35;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEAndBE_AlertsClientContact_StoreAndView_CreatedByPage extends BasePage {

    @FindBy(xpath = "//h6[contains(text(), 'Add Alert')]")
    @CacheLookup
    public WebElement btnAddAlert;

    @FindBy(xpath = "//div[@data-testid='alertType']")
    @CacheLookup
    public WebElement drpDwnAlertType_menu;

    @FindBy(xpath = "//span[contains(text(), 'Caution')]")
    @CacheLookup
    public WebElement drpDwnAlertType_menuItem;

    @FindBy(name = "reason")
    @CacheLookup
    public WebElement txtReason;

    @FindBy(xpath = "//button[@data-testid='testIdSubmit']")
    @CacheLookup
    public WebElement btnCreateClientContactAlert;

    public FEAndBE_AlertsClientContact_StoreAndView_CreatedByPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
