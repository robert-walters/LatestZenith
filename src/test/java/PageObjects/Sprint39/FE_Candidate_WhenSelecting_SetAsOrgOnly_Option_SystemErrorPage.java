package PageObjects.Sprint39;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_Candidate_WhenSelecting_SetAsOrgOnly_Option_SystemErrorPage extends BasePage {

    @FindBy(name = "first_name")
    @CacheLookup
    public WebElement txtFirstName;

    @FindBy(name = "family_name")
    @CacheLookup
    public WebElement txtFamilyName;

    @FindBy(id = "employee-organisation-lookup")
    @CacheLookup
    public WebElement txtOrganisationField;

    @FindBy(xpath = "//p[contains(text(), 'Set as ‘employer only’ organisation')]")
    @CacheLookup
    public WebElement lnkOrganisationOnly;

    @FindBy(xpath = "//input[@data-testid='desired-locations']")
    @CacheLookup
    public WebElement txtDesiredWorkLocation;

    public FE_Candidate_WhenSelecting_SetAsOrgOnly_Option_SystemErrorPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
