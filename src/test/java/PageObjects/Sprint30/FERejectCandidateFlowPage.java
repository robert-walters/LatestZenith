package PageObjects.Sprint30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FERejectCandidateFlowPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FERejectCandidateFlowPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By lnkJobItem = By.xpath("//h4[contains(text(), 'Abby Job Three')]");

    By btnReject = By.xpath("//span[contains(text(), 'Reject')]");

    By lnkOutcomeDate = By.xpath("//label[contains(text(), 'Outcome date')]");

    By btnOK = By.xpath("//span[contains(text(), 'OK')]");

    By btnSave = By.xpath("//button[@data-testid='testIdSubmit']");




    //######################################ACTIONS#####################################################


    public void clickLnkJobItem() throws Exception{
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkJobItem).click();
    }

    public void clicksBtnReject() throws Exception{
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnReject).click();
    }

    public void clickLnkOutcomeDate() throws Exception{
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkOutcomeDate).click();
    }

    public void clickBtnOK() throws Exception{
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnOK).click();
    }

    public void clickBtnSave() throws Exception{
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnSave).click();
    }
}
