package PageObjects.Sprint39;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_Candidate_SearchForACandidateByPhoneNumberPage extends BasePage {

    @FindBy(xpath = "//p[contains(text(), 'LungaCa LungaCa')]")
    @CacheLookup
    public WebElement lnkCandidateItem;

    public FE_Candidate_SearchForACandidateByPhoneNumberPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
