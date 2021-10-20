package PageObjects.Sprint34;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_ShortListPage extends BasePage {

    @FindBy(xpath = "//p[contains(text(), 'Lunga')]")
    @CacheLookup
    public WebElement lnkJobItem;

    @FindBy(xpath = "//p[contains(text(), 'Short list')]")
    @CacheLookup
    public WebElement lnkShortList;

    @FindBy(xpath = "//span[@data-testid='record-check-all']")
    @CacheLookup
    public WebElement jobCheckboxItem;

    @FindBy(xpath = "//span[contains(text(), 'Edit Activity')]")
    @CacheLookup
    public WebElement btnEditActivity;

    @FindBy(id = "Responsible-user-lookup")
    @CacheLookup
    public WebElement txtResponsibleUser;

    @FindBy(xpath = "//h6[contains(text(), 'Alec Holland')]")
    @CacheLookup
    public WebElement txtResponsibleUser_item;

    @FindBy(xpath = "//div[@aria-haspopup='listbox']")
    @CacheLookup
    public WebElement txtResponsibleTeam;

    @FindBy(xpath = "//li[@data-value='9b38e8d7-b1fc-447c-84fc-cf6bd1030cc0']")
    @CacheLookup
    public WebElement txtResponsibleTeam_item;

    @FindBy(name = "notes")
    @CacheLookup
    public WebElement txtActivityNotes;

    @FindBy(xpath = "//div[@data-testid='outcome']")
    @CacheLookup
    public WebElement btnOutcome;

    @FindBy(xpath = "//span[contains(text(), 'Rejected')]")
    @CacheLookup
    public WebElement getBtnOutcome_item;

    @FindBy(xpath = "//label[contains(text(), 'Outcome date')]")
    @CacheLookup
    public WebElement getBtnOutcomeDate;

    @FindBy(xpath = "//span[contains(text(), 'OK')]")
    @CacheLookup
    public WebElement getBtnOutcomeDate_item;

    @FindBy(xpath = "//span[contains(text(), 'Save')]")
    @CacheLookup
    public WebElement btnSave;

    public BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_ShortListPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
