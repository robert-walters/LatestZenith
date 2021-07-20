package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FETransitionToInterviewRoundsFirstScondAndAddSingleOrMultiPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FETransitionToInterviewRoundsFirstScondAndAddSingleOrMultiPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By btnCVSent= By.xpath("//p[contains(text(), 'CV Sent')]");

    By lnkFirstRound= By.xpath("//h6[contains(text(), '1st Round')]");


    //###########################################ACTIONS###################################################

    public void clickBtnCVSent() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnCVSent).click();
    }

    public void clickLnkFirstRound() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkFirstRound).click();
    }
}
