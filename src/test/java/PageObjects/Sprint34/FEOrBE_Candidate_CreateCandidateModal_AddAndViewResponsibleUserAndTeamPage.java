package PageObjects.Sprint34;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEOrBE_Candidate_CreateCandidateModal_AddAndViewResponsibleUserAndTeamPage extends BasePage {

    @FindBy(xpath = "//input[@data-testid='first-name']")
    @CacheLookup
    public WebElement firstNameText;

    @FindBy(xpath = "//input[@data-testid='family-name']")
    @CacheLookup
    public WebElement familyNameText;

    @FindBy(xpath = "//span[contains(text(), 'Save')]")
    @CacheLookup
    public WebElement btnSave;

    public FEOrBE_Candidate_CreateCandidateModal_AddAndViewResponsibleUserAndTeamPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
