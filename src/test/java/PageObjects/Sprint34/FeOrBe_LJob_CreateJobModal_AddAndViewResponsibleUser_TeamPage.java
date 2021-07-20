package PageObjects.Sprint34;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FeOrBe_LJob_CreateJobModal_AddAndViewResponsibleUser_TeamPage extends BasePage {

    @FindBy(name = "title")
    @CacheLookup
    public WebElement txtJobTitleName;

    @FindBy(id = "organisation-lookup")
    @CacheLookup
    public WebElement txtOrganisation_menu;

    @FindBy(xpath = "//span[contains(text(), 'Johannesburg')]")
    @CacheLookup
    public WebElement txtOrganisation_item;

    @FindBy(xpath = "//input[@id='location-lookup']")
    @CacheLookup
    public WebElement txtLocation_menu;

    @FindBy(xpath = "//h6[contains(text(), 'London')]")
    @CacheLookup
    public WebElement txtLocation_menuitem;

    @FindBy(xpath = "//div[@data-testid='jobStatusDropdown']")
    @CacheLookup
    public WebElement jobStatust_menu;

    @FindBy(xpath = "//span[contains(text(), 'Live')]")
    @CacheLookup
    public WebElement jobStatust_menuitem;

    @FindBy(xpath = "//div[@data-testid='agreementTypeDropdown']")
    @CacheLookup
    public WebElement aggreementType_menu;

    @FindBy(xpath = "//span[contains(text(), 'Mapping')]")
    @CacheLookup
    public WebElement aggreementType_menuitem;

    @FindBy(xpath = "//div[@data-testid='exclusivityTypeDropdown']")
    @CacheLookup
    public WebElement exclusivityType_menu;

    @FindBy(xpath = "//span[contains(text(), 'Exclusive - Yes')]")
    @CacheLookup
    public WebElement exclusivityType_menuitem;

    @FindBy(xpath = "//div[@data-testid='sourceDropdown']")
    @CacheLookup
    public WebElement source_menu_lookup;

    @FindBy(xpath = "//span[contains(text(), 'BD call')]")
    @CacheLookup
    public WebElement source_menuitem;

    @FindBy(xpath = "//div[@data-testid='jobTypeDropdown']")
    @CacheLookup
    public WebElement jobType_menu;

    @FindBy(xpath = "//span[contains(text(), 'Permanent')]")
    @CacheLookup
    public WebElement jobType_menuitem;

    public FeOrBe_LJob_CreateJobModal_AddAndViewResponsibleUser_TeamPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
