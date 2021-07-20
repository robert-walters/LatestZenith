package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CandidateActivityEditActivityPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public CandidateActivityEditActivityPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver, 10);
    }

    By lnkEdit = By.xpath("//button[@data-testid='editActivity']");


    By btnOrganisation_menu = By.id("organisation-lookup");

    By btnOrganisation_menuitem = By.xpath("//h6[contains(text(), 'Deutsche Bank AG')]");

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

    By btnSave= By.xpath("//button[@data-testid='testIdSubmit']");

    //##################################################ACTIONS##########################################################

    public void getTxtOrganisationMenu(String text) throws Exception{
        //ldriver.manage().window().maximize();
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnOrganisation_menu).sendKeys(text);
    }


    public void clickOrganisationMenuItem() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnOrganisation_menuitem).click();
    }

    public void clickLnkEditActivity() {
        ldriver.manage().window().maximize();
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkEdit).click();
    }


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

    public void btnOutcome() throws Exception {
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
