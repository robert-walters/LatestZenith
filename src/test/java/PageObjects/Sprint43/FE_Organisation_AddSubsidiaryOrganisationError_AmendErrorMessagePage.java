package PageObjects.Sprint43;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_Organisation_AddSubsidiaryOrganisationError_AmendErrorMessagePage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'United Kingdom • Live Jobs: 3')]")
    @CacheLookup
    public WebElement organisationItem;

    @FindBy(xpath = "//span[contains(text(), 'LINKED ORGS')]")
    @CacheLookup
    public WebElement linkedOrgTab;

    @FindBy(xpath = "//button[@data-testid='addChildOrg']")
    @CacheLookup
    public WebElement btnSubsidiaryOrgPlus;

    @FindBy(id = "organisation-lookup")
    @CacheLookup
    public WebElement txtOrganisationField;

    @FindBy(xpath = "//h6[contains(text(), 'Dummy Organisation')]")
    @CacheLookup
    public WebElement txtOrganisationFieldItem;

    @FindBy(xpath = "//span[contains(text(), 'Select')]")
    @CacheLookup
    public WebElement btnSelect;

    public FE_Organisation_AddSubsidiaryOrganisationError_AmendErrorMessagePage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
