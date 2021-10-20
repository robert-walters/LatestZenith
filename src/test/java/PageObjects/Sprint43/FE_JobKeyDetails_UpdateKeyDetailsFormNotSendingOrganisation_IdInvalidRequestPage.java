package PageObjects.Sprint43;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_JobKeyDetails_UpdateKeyDetailsFormNotSendingOrganisation_IdInvalidRequestPage extends BasePage {

    @FindBy(xpath = "//p[contains(text(), 'RectAuto')]")
    @CacheLookup
    public WebElement lnkJobItem;

    @FindBy(xpath = "//span[contains(text(), 'INFORMATION')]")
    @CacheLookup
    public WebElement informationTab;

    @FindBy(xpath = "//button[@data-testid='key_details_edit_button']")
    @CacheLookup
    public WebElement btnKeyDetailsEdit;

    @FindBy(name = "Working Location")
    @CacheLookup
    public WebElement txtLocationField;

    @FindBy(xpath = "//h6[contains(text(), 'London')]")
    @CacheLookup
    public WebElement txtLocationField_Item;

    public FE_JobKeyDetails_UpdateKeyDetailsFormNotSendingOrganisation_IdInvalidRequestPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
