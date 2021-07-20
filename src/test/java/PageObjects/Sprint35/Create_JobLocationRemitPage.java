package PageObjects.Sprint35;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_JobLocationRemitPage extends BasePage {

    @FindBy(name = "title")
    public WebElement jobTitleTextField;

    @FindBy(id = "organisation-lookup")
    public WebElement organisationTextField;

    @FindBy(xpath = "//span[contains(text(), 'Banking • London & 1 other location')]")
    public WebElement organisationTextField_item;

    @FindBy(xpath = "//span[contains(text(), 'Wellington Road, London, GBR')]")
    public WebElement txtLocation_menuitem;

    @FindBy(xpath = "//div[@data-testid='jobStatusDropdown']")
    public WebElement btnJobStatus;

    @FindBy(xpath = "//span[contains(text(), 'Live')]")
    public WebElement btnJobStatus_item;

    @FindBy(xpath = "//div[@data-testid='agreementTypeDropdown']")
    public WebElement btnAgreementType;

    @FindBy(xpath = "//span[contains(text(), 'Mapping')]")
    public WebElement btnAgreementType_item;

    @FindBy(xpath = "//div[@data-testid='exclusivityTypeDropdown']")
    public WebElement btnExclusivityType;

    @FindBy(xpath = "//span[contains(text(), 'Exclusive - Yes')]")
    public WebElement btnExclusivityType_item;

    @FindBy(xpath = "//div[@data-testid='sourceDropdown']")
    public WebElement btnSourceType;

    @FindBy(xpath = "//span[contains(text(), 'BD call')]")
    public WebElement btnSourceType_item;

    @FindBy(xpath = "//div[@data-testid='jobTypeDropdown']")
    public WebElement btnJobType;

    @FindBy(xpath = "//span[contains(text(), 'Interim')]")
    public WebElement btnJobType_item;

    @FindBy(xpath = "//button[@data-testid='testIdSubmit']")
    public WebElement btnCreateJob;

    public Create_JobLocationRemitPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
