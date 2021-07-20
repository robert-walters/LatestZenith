package PageObjects.Sprint35;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEAndBE_CandidateReview_UpdateReviewModal_AddResponsibleUserAndTeamPage extends BasePage {

    @FindBy(xpath = "//h6[contains(text(), 'ScrumbleBees')]")
    @CacheLookup
    public WebElement lnkCandidateReviewListItem;

    @FindBy(xpath = "//h6[@data-testid='reviewButton']")
    @CacheLookup
    public WebElement btnReview;

    @FindBy(xpath = "//h6[contains(text(), 'Alec Holland')]")
    @CacheLookup
    public WebElement txtResponsibleUser_item;

    @FindBy(xpath = "//div[@data-testid='Responsible team-label']")
    @CacheLookup
    public WebElement txtResponsibleTeam;

    @FindBy(xpath = "//li[contains(text(), 'Test Users')]")
    @CacheLookup
    public WebElement txtResponsibleTeam_item;

    public FEAndBE_CandidateReview_UpdateReviewModal_AddResponsibleUserAndTeamPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
