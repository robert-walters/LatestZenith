package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEImplementPaginationToTransitionToOfferStageSingleOrMultiPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FEImplementPaginationToTransitionToOfferStageSingleOrMultiPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By lnkAdditionalRounds= By.xpath("//p[contains(text(), 'Additional rounds')]");

    By rdBtnCheckBox= By.xpath("//span[@data-testid='record-check-all']");

    By btnOffer= By.xpath("//h6[contains(text(), 'Offer')]");

    By lnkOfferDate= By.xpath("//input[@class='MuiInputBase-input MuiFilledInput-input MuiInputBase-inputAdornedEnd MuiFilledInput-inputAdornedEnd']");

    By lnkSelectsDate= By.xpath("//span[contains(text(), 'OK')]");

    By txtSalary= By.name("value");

    By txtActivityNotes= By.name("notes");

    By btnSaveAndContinue= By.xpath("//button[@data-testid='testIdSubmit']");

    //###########################################ACTIONS###################################################

    public void clickLnkAdditionalRounds() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkAdditionalRounds).click();
    }

    public void clickRdBtnCheckBox() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(rdBtnCheckBox).click();
    }

    public void clickBtnOffer() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnOffer).click();
    }

    public void clickLnkOfferDate() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkOfferDate).click();
    }

    public void clickLnkSelectOfferDate() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkSelectsDate).click();
    }

    public void setTxtSalary(String salary) throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtSalary).sendKeys(salary);
    }

    public void setTxtActivityNotes(String activityNotes) throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtActivityNotes).sendKeys(activityNotes);
    }

    public void clickBtnSaveAndContinue() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnSaveAndContinue).click();
    }
}


