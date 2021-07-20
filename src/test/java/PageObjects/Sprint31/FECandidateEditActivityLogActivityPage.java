package PageObjects.Sprint31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FECandidateEditActivityLogActivityPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FECandidateEditActivityLogActivityPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver, 10);
    }

    By lnkCandidates = By.xpath("//span[contains(text(), 'Candidates')]");

    By lnkCandidateItem = By.xpath("//h6[contains(text(), 'AbbyCanFam')]");

    /////////////////////////////////////////////


    By txtClientContact = By.xpath("//div[@data-testid='client-lookup']");

    By txtClientContact_menuItem = By.className("MuiAutocomplete-popper");

    /////////////////////////////////////////////

    By btnJob_menu = By.id("Job-lookup-label");

    By btnJob_menuitem = By.xpath("");

    By btnMeetingType_menu = By.xpath("//div[@data-testid='meeting-type']");

    By btnMeetingType_menuitem = By.xpath("//span[contains(text(), 'Phone call')]");

    By txtLocation = By.xpath("//div[@data-testid='location-lookup']");

    By txtNotes = By.name("notes");

    By btnOutcome_menu = By.xpath("//div[@data-testid='outcome']");

    By btnOutcome_menuitem = By.xpath("//li[@tabindex='0']");

    By btnOutcomeDate = By.xpath("//div[@data-testid='Outcome date datePicker']");

    By btnOK = By.xpath("//span[contains(text(), 'OK')]");

    By btnSave= By.xpath("//button[@data-testid='edit_activitySubmit']");

    //##################################################ACTIONS##########################################################

    public void clickLnkCandidates() throws Exception{
        ldriver.manage().window().maximize();
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkCandidates).click();
    }

    public void clickLnkCandidatesItem() throws Exception{
        ldriver.manage().window().maximize();
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkCandidateItem).click();
    }
    //////////////////////////////////////////////////////////////////////////////////////

    public void setTxtClientContact(String clientContact) {
        Actions actions = new Actions(ldriver);
        actions.pause(3000);
        ldriver.findElement(txtClientContact).sendKeys(clientContact);
    }


    ///////////////////////////////////////////////////////////////////////////////////////


    public void clickBtnActivityType_menu() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnJob_menu).click();
        ldriver.findElement(btnJob_menuitem).click();
    }

    public void clickBtnMeetingType_menu() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnMeetingType_menu).click();
        ldriver.findElement(btnMeetingType_menuitem).click();
    }

    public void txtLocation(String location) throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtLocation).sendKeys(location);

    }

    public void txtNotes(String notes) throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtNotes).sendKeys(notes);
    }

    public void clickBtnOutcome() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnOutcome_menu).click();
        ldriver.findElement(btnOutcome_menuitem).click();
    }

    public void clickOutcomeDate() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnOutcomeDate).click();
    }

    public void clickOK() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnOK).click();
    }

    public void clickBtnSave() throws Exception{
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        Thread.sleep(5000);
        ldriver.findElement(btnSave).click();
    }
}
