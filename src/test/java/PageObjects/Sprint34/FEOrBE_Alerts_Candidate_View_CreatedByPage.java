package PageObjects.Sprint34;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEOrBE_Alerts_Candidate_View_CreatedByPage extends BasePage {

    @FindBy(xpath = "//h6[contains(text(), 'Lunga Lunga')]")
    @CacheLookup
    public WebElement lnkCandidate_item;

    @FindBy(xpath = "//h6[contains(text(), 'Add Alert')]")
    @CacheLookup
    public WebElement btnAddAlert;

    @FindBy(xpath = "//div[@data-testid='alertType']")
    @CacheLookup
    public WebElement btnAlertType;

    @FindBy(xpath = "//button[@data-testid='testIdSubmit']")
    @CacheLookup
    public WebElement btnCreateCandidateAlert;

    @FindBy(xpath = "//h6[@data-testid='alert']")
    @CacheLookup
    public WebElement btnAlert;

    @FindBy(xpath = "//p[contains(text(), \"J'onn J'onzz - 4 July 2021\")]")
    @CacheLookup
    public WebElement txtVerification;



    public FEOrBE_Alerts_Candidate_View_CreatedByPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }

}
