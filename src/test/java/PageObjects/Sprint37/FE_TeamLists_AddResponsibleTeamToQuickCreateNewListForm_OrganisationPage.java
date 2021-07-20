package PageObjects.Sprint37;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_TeamLists_AddResponsibleTeamToQuickCreateNewListForm_OrganisationPage extends BasePage {

    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/div/div[1]/div/button[3]")
    @CacheLookup
    public WebElement btnOrganisation;

    @FindBy(xpath = "//button[@data-testid='testIdSubmit']")
    @CacheLookup
    public WebElement btnCreateOrganisationList;

    @FindBy(xpath = "//li[contains(text(), 'ScrumbleBees')]")
    @CacheLookup
    public WebElement txtResponsibleTeam_item;

    public FE_TeamLists_AddResponsibleTeamToQuickCreateNewListForm_OrganisationPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
