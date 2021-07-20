package PageObjects.Sprint37;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_CandidateReviewListDisplaying_Undefined_InHeaderForZeroCandidatesInListPage extends BasePage {

    @FindBy(xpath = "//h6[contains(text(), '1 Candidate')]")
    @CacheLookup
    public WebElement lnkCandidateReviewList_item;

    public FE_CandidateReviewListDisplaying_Undefined_InHeaderForZeroCandidatesInListPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
