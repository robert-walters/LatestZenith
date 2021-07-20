package PageObjects.Sprint35;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEAndBE_CandidateReviewList_DisplayRUInGridInsteadOfFlagConsultantsPage extends BasePage {

    @FindBy(xpath = "//h6[@data-testid='reviewButton']")
    @CacheLookup
    public WebElement getBtnReview;

    public FEAndBE_CandidateReviewList_DisplayRUInGridInsteadOfFlagConsultantsPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }

}
