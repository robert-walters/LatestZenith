package PageObjects.Sprint37;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_TeamLists_AddResponsibleTeamToQuickCreateNewListFormPage extends BasePage {

    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/div/div/div/button[1]/span[1]/span")
    @CacheLookup
    public WebElement btnCandidate;

    @FindBy(name = "name")
    @CacheLookup
    public WebElement txtListNameField;

    @FindBy(xpath = "//button[@data-testid='testIdSubmit']")
    @CacheLookup
    public WebElement btnCreateCandidateList;

    public FE_TeamLists_AddResponsibleTeamToQuickCreateNewListFormPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
