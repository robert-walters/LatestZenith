package PageObjects.Sprint34;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEAndBE_Candidate_Status_not_updating_or_setting_to_correct_default_valuePage extends BasePage {

    @FindBy(xpath = "//p[contains(text(), 'Lunga Lunga')]")
    @CacheLookup
    public WebElement lnkCandidateItem;

    public FEAndBE_Candidate_Status_not_updating_or_setting_to_correct_default_valuePage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
