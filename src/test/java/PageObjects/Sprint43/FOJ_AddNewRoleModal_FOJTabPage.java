package PageObjects.Sprint43;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FOJ_AddNewRoleModal_FOJTabPage extends BasePage {

    @FindBy(xpath = "//p[contains(text(), 'Lunga Lunga')]")
    @CacheLookup
    public WebElement candidateItem;

    @FindBy(xpath = "//span[contains(text(), 'CAREER')]")
    @CacheLookup
    public WebElement careerTab;

    @FindBy(xpath = "//button[@data-testid='currentRole_add_button']")
    @CacheLookup
    public WebElement btnCurrentRolesPlus;

    @FindBy(id = "mui-component-select-source")
    @CacheLookup
    public WebElement txtHowWasTheJobFound_Dropdown;

    @FindBy(xpath = "//li[@data-testid='direct']")
    @CacheLookup
    public WebElement txtHowWasTheJobFound_Item;

    @FindBy(id = "job_title")
    @CacheLookup
    public WebElement txtJobTitle_Field;

    @FindBy(id = "mui-component-select-position_type")
    @CacheLookup
    public WebElement positionType_Dropdown;

    @FindBy(xpath = "//li[@data-testid='temp_to_perm']")
    @CacheLookup
    public WebElement positionType_Item;

    @FindBy(name = "value")
    @CacheLookup
    public WebElement txtRate;


    @FindBy(xpath = "//div[@data-testid='salary-period']")
    @CacheLookup
    public WebElement btnSalaryPeriod;

    @FindBy(xpath = "//li[@data-value='per_week']")
    @CacheLookup
    public WebElement btnSalaryPeriod_Item;

    @FindBy(xpath = "//label[contains(text(), 'Availability/Notice')]")
    @CacheLookup
    public WebElement availabilityNotice_Dropdown;

    @FindBy(xpath = "//span[contains(text(), '1 month')]")
    @CacheLookup
    public WebElement availabilityNotice_Item;

    @FindBy(xpath = "//div[@data-testid='Update Candidate Status-label']")
    @CacheLookup
    public WebElement updateCandidateStatus_Dropdown;

    @FindBy(xpath = "//li[@data-testid='active']")
    @CacheLookup
    public WebElement updateCandidateStatus_Item;

    @FindBy(name = "Organisation")
    @CacheLookup
    public WebElement organisationTextField;

    @FindBy(xpath = "//h6[contains(text(), 'Lunga')]")
    @CacheLookup
    public WebElement organisationTextField_Item;

    @FindBy(id = "Location-lookup")
    @CacheLookup
    public WebElement locationTextField;

    @FindBy(xpath = "//h6[contains(text(), 'London')]")
    @CacheLookup
    public WebElement locationTextField_Item;

    @FindBy(name = "lineManager_TextField")
    @CacheLookup
    public WebElement lineManager_TextField;

    @FindBy(xpath = "//h6[contains(text(), 'Lunga Lunga')]")
    @CacheLookup
    public WebElement lineManager_TextField_Item;


    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[3]/div[2]/div[4]/div[1]/label/span[1]/span[1]/input")
    @CacheLookup
    public WebElement createClientContactRecord_Checkbox;

    @FindBy(xpath = "//button[@data-testid='testIdSubmit']")
    @CacheLookup
    public WebElement btnSubmit;

    public FOJ_AddNewRoleModal_FOJTabPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
