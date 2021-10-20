package PageObjects.Sprint39;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_CandidateTeamListAndPipelineStages_Rename_CurrentRole_ColumnPage extends BasePage {

    @FindBy(xpath = "//h6[contains(text(), 'RW Commerce - Manchester')]")
    @CacheLookup
    public WebElement lnkCandidateListItem;

    public FE_CandidateTeamListAndPipelineStages_Rename_CurrentRole_ColumnPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
