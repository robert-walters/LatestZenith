package PageObjects.Sprint35;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEAndBE_CandidateRecord_EditResponsibleUserPage extends BasePage {

    @FindBy(id = "scrollable-auto-tab-5")
    @CacheLookup
    public WebElement lnkInternalTab;

    @FindBy(xpath = "//button[@data-testid='InternalRecord_edit_button']")
    @CacheLookup
    public WebElement btnEditRecordInfo;

    @FindBy(id = "Responsible-user-lookup")
    @CacheLookup
    public WebElement txtResponsibleUser;

    @FindBy(xpath = "//h6[contains(text(), 'Ajesh Jally')]")
    @CacheLookup
    public WebElement txtResponsibleUser_item;

    public FEAndBE_CandidateRecord_EditResponsibleUserPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
