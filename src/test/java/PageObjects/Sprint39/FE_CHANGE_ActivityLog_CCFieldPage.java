package PageObjects.Sprint39;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_CHANGE_ActivityLog_CCFieldPage extends BasePage {

    @FindBy(xpath = "//p[contains(text(), 'LungaAuto')]")
    @CacheLookup
    public WebElement lnkJobItem;

    @FindBy(xpath = "//span[contains(text(), 'ACTIVITY')]")
    @CacheLookup
    public WebElement lnkActivityTab;

    @FindBy(xpath = "//button[@data-testid='ActivityTab-Jobs_add_button']")
    @CacheLookup
    public WebElement btnActivityPlus;

    @FindBy(xpath = "//div[@data-testid='activity-type']")
    @CacheLookup
    public WebElement dropDownBtnActivityType;

    @FindBy(xpath = "//span[contains(text(), 'Spec Digital Passport Sent (ANZ)')]")
    @CacheLookup
    public WebElement dropDownBtnActivityType_Item;

    @FindBy(id = "client-lookup-label")
    @CacheLookup
    public WebElement txtClientContact;

    public FE_CHANGE_ActivityLog_CCFieldPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
