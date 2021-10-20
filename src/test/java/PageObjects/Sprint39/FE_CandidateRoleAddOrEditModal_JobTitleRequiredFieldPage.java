package PageObjects.Sprint39;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_CandidateRoleAddOrEditModal_JobTitleRequiredFieldPage extends BasePage {

    @FindBy(xpath = "//p[contains(text(), 'LungaCa LungaCa')]")
    @CacheLookup
    public WebElement lnkCandidateItem;

    @FindBy(xpath = "//span[contains(text(), 'CAREER')]")
    @CacheLookup
    public WebElement lnkCareerTab;

    @FindBy(xpath = "//button[@data-testid='currentRole_add_button']")
    @CacheLookup
    public WebElement btnAddCurrentRole;

    @FindBy(xpath = "//button[@data-testid='testIdSubmit']")
    @CacheLookup
    public WebElement btnAddNewRole;

    public FE_CandidateRoleAddOrEditModal_JobTitleRequiredFieldPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
