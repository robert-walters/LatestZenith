package PageObjects.Sprint29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ALCandidatesCreateViewEditMarketingEventsFilterPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public ALCandidatesCreateViewEditMarketingEventsFilterPage (WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By lnkCandidate = By.xpath("//h6[contains(text(), 'QA Manager')]");

    By rdMarketing = By.name("Marketing");


    //###########################################ACTIONS###################################################

    public void clickLnkCandidate() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkCandidate).click();
    }

    public void clickRdMarketing() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(rdMarketing).click();
    }

}
