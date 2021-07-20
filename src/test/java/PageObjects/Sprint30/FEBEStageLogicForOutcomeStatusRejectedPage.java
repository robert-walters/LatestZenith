package PageObjects.Sprint30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEBEStageLogicForOutcomeStatusRejectedPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FEBEStageLogicForOutcomeStatusRejectedPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By lnkScrollableJob = By.id("scrollable-auto-tab-Jobs");

    By lnkJob_item = By.xpath("//p[contains(text(), 'LungaTwo')]");

    By btnEditActivity = By.xpath("//span[contains(text(), 'Edit Activity')]");

    By btnOutcome_menu = By.xpath("//div[@data-testid='outcome']");

    By btnOutcome_menuitem = By.xpath("//span[contains(text(), 'Wrong Entry')]");

    By btnOutcome_menuitemTwo = By.xpath("//span[contains(text(), 'Rejected')]");

    By btnOK = By.xpath("//button[@data-testid='testIdSubmit']");


    //######################################ACTIONS#####################################################

    public void clickLnkScrollableJob() throws Exception{
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkScrollableJob).click();
    }

    public void clickLnkJobItem() throws Exception{
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkJob_item).click();
    }

    public void clickBtnOutcome() throws Exception{
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnOutcome_menu).click();
    }

    public void clickBtnOutcomeItem() throws Exception{
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnOutcome_menuitem).click();
    }

    public void clickBtnOutcomeItemTwo() throws Exception{
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnOutcome_menuitemTwo).click();
    }

    public void clickEditActivity() throws Exception{
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnEditActivity).click();
    }

    public void clickBtnOK() throws Exception{
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnOK).click();
    }

}
