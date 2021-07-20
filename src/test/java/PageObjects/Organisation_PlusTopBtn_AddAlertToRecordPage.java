package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Organisation_PlusTopBtn_AddAlertToRecordPage extends BasePage{

    @FindBy(xpath = "//h6[contains(text(), 'Telecommunications')]")
    @CacheLookup
    public WebElement lnkOrganisationItem;

    @FindBy(xpath = "//button[@data-testid='addToButton']")
    @CacheLookup
    public WebElement btnPlusIcon;

    @FindBy(xpath = "//h6[contains(text(), 'Add Alert')]")
    @CacheLookup
    public WebElement btnAddAlert;


    @FindBy(xpath = "//div[@data-testid='alertType']")
    @CacheLookup
    public WebElement btnType_menu;

    @FindBy(xpath = "//span[contains(text(), 'Caution')]")
    @CacheLookup
    public WebElement btnType_menuitem;

    @FindBy(name = "reason")
    @CacheLookup
    public WebElement txtReason;

    @FindBy(xpath = "//label[contains(text(), 'Expiry date')]")
    @CacheLookup
    public WebElement btnExpiryDate;
    //By btnExpiryDate = By.xpath("class='MuiInputBase-input MuiFilledInput-input MuiInputBase-inputAdornedEnd MuiFilledInput-inputAdornedEnd'");


    @FindBy(xpath = "//button[@data-testid='alertSubmit']")
    @CacheLookup
    public WebElement btnOK;

    @FindBy(xpath = "")
    @CacheLookup
    public WebElement btnCreate;

    public Organisation_PlusTopBtn_AddAlertToRecordPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
