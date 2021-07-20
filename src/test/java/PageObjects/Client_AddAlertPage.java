package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Client_AddAlertPage extends BasePage{

    @FindBy(xpath = "//h6[contains(text(), 'Aaa Client Acandi')]")
    public WebElement lnkClientItem;

    @FindBy(xpath = "//li[@tabindex='-1']")
    public WebElement btnCCAddAlert;

    @FindBy(xpath = "//div[@data-testid='alertType']")
    public WebElement btnAlertType_menu;

    @FindBy(xpath = "//span[contains(text(), 'Placement')]")
    public WebElement btnAlertType_menuitem;

    @FindBy(name = "reason")
    public WebElement txtReason;

    @FindBy(xpath = "//span[contains(text(), 'Create')]")
    public WebElement btnCreateCCAlert;

    public Client_AddAlertPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
