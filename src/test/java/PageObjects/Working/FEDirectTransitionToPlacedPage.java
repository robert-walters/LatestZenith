package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEDirectTransitionToPlacedPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FEDirectTransitionToPlacedPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By lnkSendCV= By.xpath("//p[contains(text(), 'CV Sent')]");

    By btnOffer = By.xpath("//h6[contains(text(), 'Offer')]");


    //###########################################ACTIONS###################################################


    public void clickLnkSendCV() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkSendCV).click();
    }

    public void clickBtnOffer() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnOffer).click();
    }
}
