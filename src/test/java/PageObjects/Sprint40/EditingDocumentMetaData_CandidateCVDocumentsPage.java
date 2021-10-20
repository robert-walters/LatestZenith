package PageObjects.Sprint40;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditingDocumentMetaData_CandidateCVDocumentsPage extends BasePage {

    @FindBy(xpath = "//p[contains(text(), 'Lunga Lunga')]")
    @CacheLookup
    public WebElement lnkCandidateItem;

    @FindBy(xpath = "//span[contains(text(), 'DOCUMENTS')]")
    @CacheLookup
    public WebElement lnkDocumentsTab;

    @FindBy(xpath = "//h6[contains(text(), 'english')]")
    @CacheLookup
    public WebElement lnkDocumentItem;

    @FindBy(name = "description")
    @CacheLookup
    public WebElement txtDescription;

    @FindBy(id = "mui-component-select-language")
    @CacheLookup
    public WebElement drpdLanguage;

    @FindBy(xpath = "//span[contains(text(), 'Cancel')]")
    @CacheLookup
    public WebElement btnCancel;

    public EditingDocumentMetaData_CandidateCVDocumentsPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
