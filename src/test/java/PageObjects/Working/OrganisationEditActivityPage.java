package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrganisationEditActivityPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public OrganisationEditActivityPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver, 10);
    }

    By btnOrganisation_menu = By.xpath("//a[@data-testid='allOrganisationsLink']");

    By lnkOrganisation_item = By.xpath("//h6[contains(text(), 'Orange1')]");

    By lnkEdit = By.xpath("//button[@data-testid='editActivity']");

    By txtCandidate= By.id("Candidate-lookup-label");

    By txtCandidate_item= By.xpath("//input[@value=' Thomas  Fischer']");

    By btnJob_menu = By.id("Job-lookup-label");

    By btnJob_menuitem = By.xpath("//input[@value='Job Chapter 18']");




    //##############################################ACTIONS######################################################

    public void clickBtnOrganisation_menu() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnOrganisation_menu).click();

    }

    public void clickLnkOrganisation_item() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkOrganisation_item).click();

    }

    public void clickLnkEditActivity() {
        ldriver.findElement(lnkEdit).click();
    }

    public void setTxtCandidate() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        WebElement ele = ldriver.findElement(txtCandidate);
        ele.click();
        waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtCandidate_item).click();
    }

    public void clickBtnJob_menu() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnJob_menu).click();
        waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnJob_menuitem);
    }













}
