package PageObjects.Sprint35;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CandidateReviewList_DisableReviewButtonPage extends BasePage {

    @FindBy(xpath = "//a[@data-testid='expandButton']")
    @CacheLookup
    public WebElement btnExpandPage;

    @FindBy(xpath = "//li[@tabindex='0']")
    @CacheLookup
    public WebElement lnkPlaced;

    public CandidateReviewList_DisableReviewButtonPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
