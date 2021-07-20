package PageObjects.Sprint30;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BE_Alerts_Candidate_AddAndViewOnRecordPage extends BasePage {

    @FindBy(xpath = "//div[@data-testid='alertType']")
    @CacheLookup
    public WebElement btnAlertType;

    @FindBy(xpath = "//p[contains(text(), 'Lunga Lunga')]")
    @CacheLookup
    public WebElement lnkCandidateItem;

    @FindBy(name = "reason")
    @CacheLookup
    public WebElement txtReason;

    public BE_Alerts_Candidate_AddAndViewOnRecordPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
