package PageObjects.Sprint40;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_ClientContact_AddOrEditRole_Display_AddAndEditPrimaryContactPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'INFORMATION')]")
    @CacheLookup
    public WebElement btnInformationTab;

    @FindBy(xpath = "//div[@data-testid='card-header']//button")
    @CacheLookup
    public WebElement btnEditPosition;

    @FindBy(xpath = "//p[contains(text(), 'Edit this position')]")
    @CacheLookup
    public WebElement btnEditThisPosition;


    public FE_ClientContact_AddOrEditRole_Display_AddAndEditPrimaryContactPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
