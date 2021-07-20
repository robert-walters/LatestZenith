package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEEditCVSentModalSingleOrMultiPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FEEditCVSentModalSingleOrMultiPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By btnEditActivity= By.xpath("//span[contains(text(), 'Edit Activity')]");

    By txtClientContact= By.id("client-lookup");

    By btnOutcome_menu= By.xpath("//div[@data-testid='outcome']");

    By getBtnOutcome_menuitem= By.xpath("//span[contains(text(), 'Wrong Entry')]");

    By btnOutcomeDate= By.xpath("//label[contains(text(), 'Outcome date')]");

    By btnSave= By.xpath("//button[@data-testid='testIdSubmit']");


    //###########################################ACTIONS###################################################

    public void clickBtnCVSent() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnEditActivity).click();
    }

    public void setTxtClientContact() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtClientContact).sendKeys();
    }

    public void clickBtnOutcome_menu() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnOutcome_menu).click();
//        Thread.sleep(3000);
//        waiting = new WebDriverWait(ldriver, 15, 100);
//        ldriver.findElement(getBtnOutcome_menuitem).click();
    }

    public void clickOutcomeDate() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnOutcomeDate).click();
    }

    public void clickBtnSave() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnSave).click();
    }
}
