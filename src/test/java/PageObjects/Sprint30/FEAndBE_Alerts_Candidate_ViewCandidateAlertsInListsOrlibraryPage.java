package PageObjects.Sprint30;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEAndBE_Alerts_Candidate_ViewCandidateAlertsInListsOrlibraryPage extends BasePage {

    @FindBy(xpath = "//h4[contains(text(), 'Lunga')]")
    @CacheLookup
    public WebElement lnkCandidateListItem;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[4]/div/div[1]/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[2]/div/div/button/span[1]/div/span")
    @CacheLookup
    public WebElement imgAlert;



    public FEAndBE_Alerts_Candidate_ViewCandidateAlertsInListsOrlibraryPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
