package PageObjects.Sprint34;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage extends BasePage {

    @FindBy(xpath = "//h6[contains(text(), 'Lunga Lunga')]")
    @CacheLookup
    public WebElement lnkClientContact_menuitem;

    @FindBy(xpath = "//button[@data-testid='ClientActivities_add_button']")
    @CacheLookup
    public WebElement btnCCPlus;

    @FindBy(xpath = "//div[@data-testid='activity-type']")
    @CacheLookup
    public WebElement btnActivityType;


    @FindBy(xpath = "//span[contains(text(), 'Client Call')]")
    @CacheLookup
    public WebElement btnActivityType_item;

    @FindBy(id = "Responsible-user-lookup")
    @CacheLookup
    public WebElement btnResponsibleUser;

    @FindBy(xpath = "//input[@value='Alex Berry']")
    @CacheLookup
    public WebElement btnResponsibleUser_item;

    @FindBy(id = "Other-consultants-lookup")
    @CacheLookup
    public WebElement btnOtherConsultants;

    @FindBy(xpath = "//h6[contains(text(), 'Alex Berry')]")
    @CacheLookup
    public WebElement btnOtherConsultants_item;

    @FindBy(xpath = "//button[@data-testid='testIdSubmit']")
    @CacheLookup
    public WebElement btnCreateActivity;


    public FEActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
