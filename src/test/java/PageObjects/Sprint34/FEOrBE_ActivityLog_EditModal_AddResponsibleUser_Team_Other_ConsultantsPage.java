package PageObjects.Sprint34;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEOrBE_ActivityLog_EditModal_AddResponsibleUser_Team_Other_ConsultantsPage extends BasePage {

    @FindBy(xpath = "//button[@data-testid='editActivity']")
    @CacheLookup
    public WebElement btnEditActivityCVSent;

    @FindBy(id = "Responsible-user-lookup")
    @CacheLookup
    public WebElement btnResponsibleUser;

    @FindBy(xpath = "//h6[contains(text(), 'Ajesh Jally')]")
    @CacheLookup
    public WebElement btnResponsibleUser_item;

//    WebElement radioBtn1 = ldriver.findElement(By.id("jobType10"));
//        ((JavascriptExecutor) ldriver).executeScript("arguments[0].checked = true;", radioBtn1);

    @FindBy(xpath = "//div[@data-testid='Responsible team-label']")
    @CacheLookup
    public WebElement btnResponsibleTeam;

    @FindBy(xpath = "")
    @CacheLookup
    public WebElement btnResponsibleTeam_item;

    @FindBy(id = "Other-Consultants-lookup")
    @CacheLookup
    public WebElement txtOtherConsultant;

    @FindBy(xpath = "//h6[contains(text(), 'Alec Holland')]")
    @CacheLookup
    public WebElement txtOtherConsultant_menuitem;

    @FindBy(xpath = "//span[contains(text(), 'Create')]")
    @CacheLookup
    public WebElement btnActivityCreate;




    public FEOrBE_ActivityLog_EditModal_AddResponsibleUser_Team_Other_ConsultantsPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
