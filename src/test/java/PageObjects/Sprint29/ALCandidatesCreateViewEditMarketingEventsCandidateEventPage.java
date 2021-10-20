package PageObjects.Sprint29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class >~]lALCandidatesCreateViewEditMarketingEventsCandidateEventPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public ALCandidatesCreateViewEditMarketingEventsCandidateEventPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By btnActivityTpe_menu = By.xpath("//div[@data-testid='activity-type']");

    By lnkActivityType_menuitem = By.xpath("//span[contains(text(), 'Spec Digital Passport Sent (ANZ)')]");


    //###########################################ACTIONS################################################################

    public void clickActivityTypeItemC() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnActivityTpe_menu).click();

        Thread.sleep(3000);
        waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkActivityType_menuitem).click();
    }
}
