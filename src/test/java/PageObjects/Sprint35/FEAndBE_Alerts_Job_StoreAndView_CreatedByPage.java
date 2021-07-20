package PageObjects.Sprint35;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEAndBE_Alerts_Job_StoreAndView_CreatedByPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'Caution')]")
    @CacheLookup
    public WebElement drpDwnJobAlertType_menuItem;

    @FindBy(xpath = "//h6[contains(text(), 'Add Alert')]")
    @CacheLookup
    public WebElement btnAddAlert;

    public FEAndBE_Alerts_Job_StoreAndView_CreatedByPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
