package PageObjects.Sprint37;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CHANGE_JobLocationRemit_PopUpModalPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'INFORMATION')]")
    @CacheLookup
    public WebElement lnkInformationTab;

    @FindBy(xpath = "//button[@data-testid='key_details_edit_button']")
    @CacheLookup
    public WebElement btnEditKeyDetails;

    @FindBy(name = "title")
    @CacheLookup
    public WebElement txtJobTitleField;

    @FindBy(id = "location-lookup")
    @CacheLookup
    public WebElement txtWorkingLocationField;

    @FindBy(xpath = "//h6[contains(text(), 'London')]")
    @CacheLookup
    public WebElement txtWorkingLocationField_item;

    @FindBy(xpath = "//button[@data-testid='testIdSubmit']")
    @CacheLookup
    public WebElement btnUpdateKeyDetails;

    @FindBy(xpath = "//button[@data-cy='cancel_form']")
    @CacheLookup
    public WebElement btnCancel;

    @FindBy(xpath = "//button[@data-testid='discard-action']")
    @CacheLookup
    public WebElement btnOkay;

    public CHANGE_JobLocationRemit_PopUpModalPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
