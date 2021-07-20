package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEGridViewOfferPlacedPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FEGridViewOfferPlacedPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By lnkOffers= By.xpath("//p[contains(text(), 'Offer')]");


    //###########################################ACTIONS###################################################


    public void clickLnkOffers() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkOffers).click();
    }

}
