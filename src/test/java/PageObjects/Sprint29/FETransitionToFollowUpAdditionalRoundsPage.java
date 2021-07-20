package PageObjects.Sprint29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FETransitionToFollowUpAdditionalRoundsPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FETransitionToFollowUpAdditionalRoundsPage (WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By getBtnFirstRound = By.xpath("//p[contains(text(), '1st round')]");

    By btnSecondRound= By.xpath("//h6[contains(text(), '2nd Round')]");

    By btnSave = By.xpath("//span[contains(text(), 'Save')]");

    By getBtnSecondRound = By.xpath("//p[contains(text(), '2nd round')]");

    By lnkAdditionalRound = By.xpath("//h6[contains(text(), 'Additional Round')]");

    //###########################################ACTIONS###################################################

    public void clickGetBtnFirstRound() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(getBtnFirstRound).click();
    }

    public void clickBtnSecondRound() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnSecondRound).click();
    }

    public void clickBtnSaveToSecondRound() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnSave).click();
    }

    public void clickGetBtnSecondRound() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(getBtnSecondRound).click();
    }

    public void clickLnkAdditionalRound() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkAdditionalRound).click();
    }


}
