package PageObjects.Sprint40;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_ClientContact_CreateFormFields_SetPrimaryContactPage extends BasePage {

    @FindBy(name = "first_name")
    @CacheLookup
    public WebElement txtFirstNameField;

    @FindBy(name = "family_name")
    @CacheLookup
    public WebElement txtLastNameField;

    @FindBy(name = "job_title")
    @CacheLookup
    public WebElement txtJobTitleField;

    @FindBy(id = "organisation-lookup")
    @CacheLookup
    public WebElement txtOrganisationField;

    @FindBy(xpath = "//h6[contains(text(), 'Lunga(Automation do not delete)')]")
    @CacheLookup
    public WebElement txtOrganisationField_Item;

    @FindBy(id = "location-lookup")
    @CacheLookup
    public WebElement txtLocationField;

    @FindBy(xpath = "//h6[contains(text(), 'London')]")
    @CacheLookup
    public WebElement getTxtLocationField_Item;

    public FE_ClientContact_CreateFormFields_SetPrimaryContactPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
