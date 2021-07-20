package PageObjects.Sprint35;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEAndBE_CandidateReviewList_DisplayTeamNameInHeaderPage extends BasePage {

    @FindBy(xpath = "/html/body/div/div/div[1]/div[4]/div/div/div[1]/div[1]/div[2]/div/p")
    @CacheLookup
    public WebElement lnkHeader;

    public FEAndBE_CandidateReviewList_DisplayTeamNameInHeaderPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
