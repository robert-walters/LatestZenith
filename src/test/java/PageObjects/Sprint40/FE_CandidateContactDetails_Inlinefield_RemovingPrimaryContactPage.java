package PageObjects.Sprint40;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_CandidateContactDetails_Inlinefield_RemovingPrimaryContactPage extends BasePage {

    @FindBy(xpath = "//p[contains(text(), 'LungaCa LungaCa')]")
    @CacheLookup
    public WebElement lnkCandidate;

    @FindBy(xpath = "//span[contains(text(), 'PERSONAL')]")
    @CacheLookup
    public WebElement btnPersonalTab;

    @FindBy(xpath = "//input[@value='7911123444']")
    @CacheLookup
    public WebElement clearContact;


    public FE_CandidateContactDetails_Inlinefield_RemovingPrimaryContactPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
