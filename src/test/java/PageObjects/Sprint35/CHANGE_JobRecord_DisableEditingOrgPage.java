package PageObjects.Sprint35;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CHANGE_JobRecord_DisableEditingOrgPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'INFORMATION')]")
    @CacheLookup
    public WebElement lnkInformationTab;

    @FindBy(xpath = "//button[@data-testid='key_details_edit_button']")
    @CacheLookup
    public WebElement btnKeyDetailsEdit;

    @FindBy(xpath = "//span[contains(text(), 'Cancel')]")
    @CacheLookup
    public WebElement btnCancel;

    @FindBy(xpath = "//input[@data-testid='title']")
    @CacheLookup
    public WebElement txtJobTile;

    @FindBy(id = "location-lookup")
    @CacheLookup
    public WebElement txtWorkingLocationName;

    @FindBy(xpath = "//h6[contains(text(), 'Amsterdam Office')]")
    @CacheLookup
    public WebElement txtWorkingLocationName_item;

    @FindBy(xpath = "//span[contains(text(), 'Update')]")
    @CacheLookup
    public WebElement btnUpdateKeyDetails;



    public CHANGE_JobRecord_DisableEditingOrgPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
