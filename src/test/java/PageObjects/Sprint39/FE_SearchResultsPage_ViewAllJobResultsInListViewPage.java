package PageObjects.Sprint39;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_SearchResultsPage_ViewAllJobResultsInListViewPage extends BasePage {

    @FindBy(xpath = "//h6[contains(text(), 'SEE ALL RESULTS')]")
    public WebElement lnkSeeAllResults;

    @FindBy(xpath = "//h6[contains(text(), 'LungasNewOrg')]")
    public WebElement lnkCandidateItem;

    @FindBy(xpath = "//a[@data-testid='expandButton']")
    public WebElement btnExpand;

    public FE_SearchResultsPage_ViewAllJobResultsInListViewPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
