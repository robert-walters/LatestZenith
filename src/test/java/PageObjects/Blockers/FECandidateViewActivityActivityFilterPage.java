package PageObjects.Blockers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FECandidateViewActivityActivityFilterPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FECandidateViewActivityActivityFilterPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By btnFilterActivities= By.xpath("//span[contains(text(), 'Filter activities')]");

    By rdBtnEmail= By.name("Marketing");


    //###########################################ACTIONS###################################################


    public void clickBtnFilterActivities() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnFilterActivities).click();
    }

    public void clickRdBtnEmail() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(rdBtnEmail).click();
    }
}
