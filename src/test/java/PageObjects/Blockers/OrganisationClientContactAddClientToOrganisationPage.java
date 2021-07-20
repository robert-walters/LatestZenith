package PageObjects.Blockers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrganisationClientContactAddClientToOrganisationPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public OrganisationClientContactAddClientToOrganisationPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By lnkClientContacts= By.xpath("//a[@id='scrollable-auto-tab-4']");

    By rdBtnClient= By.xpath("");

    By btnAddTo = By.xpath("//span[contains(text(), 'Add To')]");

    By btnAddToList = By.id("//h6[contains(text(), 'Add to list')]");


    //###########################################ACTIONS###################################################


    public void clickLnkClientContacts() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkClientContacts).click();
    }

    public void clickRdBtnClient() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(rdBtnClient).click();
    }

    public void clickBtnAddTo() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnAddTo).click();
    }

    public void clickBtnAddToList() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnAddToList).click();
    }
}
