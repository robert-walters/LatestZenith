package PageObjects.Sprint29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ALCCCreateViewEditMarketingEventsClientEventPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public ALCCCreateViewEditMarketingEventsClientEventPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By btnActivityTpe_menu = By.xpath("//div[@data-testid='activity-type']");

    By lnkActivityType_menuitem = By.xpath("//span[contains(text(), 'Client Event')]");


    //###########################################ACTIONS################################################################

    public void clickActivityTypeMenu() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnActivityTpe_menu).click();


    }

    public void clickActivityTypeItem() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkActivityType_menuitem).click();
    }

}
