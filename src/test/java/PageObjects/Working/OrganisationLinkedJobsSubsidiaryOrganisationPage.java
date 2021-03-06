package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrganisationLinkedJobsSubsidiaryOrganisationPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public OrganisationLinkedJobsSubsidiaryOrganisationPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver, 10);
    }


    By lnkLinkedOrgs = By.id("scrollable-auto-tab-6");

    By btnSubsidiaryOrganisation = By.xpath("//button[@data-testid='addChildOrg']");



    By txtOrganisation_menu = By.xpath("//input[@id='organisation-lookup']");

    By txtOrganisation_menuitem = By.xpath("//h6[contains(text(), 'Deutsche Bank AG')]");



    By btnSelect= By.xpath("//button[@data-testid='create_organisation_subsidiarySubmit']");

    //###############################################ACTIONS#########################################################

    public void clickLnkLinkedOrgs() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkLinkedOrgs).click();
    }

    public void clickBtnSubsidiaryOrganisation() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnSubsidiaryOrganisation).click();
    }

    //##########################################################ORGANISATION###########################################

    public void setTxtOrganisation_menu(String text) throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtOrganisation_menu).sendKeys(text);
    }

    public void clickOrganisationMenuItem() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtOrganisation_menuitem).click();
    }



    public void setBtnSelect() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnSelect).click();
    }
}
