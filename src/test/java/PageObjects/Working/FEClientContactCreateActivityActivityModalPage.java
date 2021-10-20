package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEClientContactCreateActivityActivityModalPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FEClientContactCreateActivityActivityModalPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By btnOpenSearch= By.xpath("//button[@data-testid='openSearch']");

    By txtSearchField= By.xpath("//input[@type='search']");

    By btnScrollableClientContacts= By.id("scrollable-auto-tab-Client Contacts");

    By lnkClient_item= By.xpath("//p[contains(text(), 'LungaTwo LungaTwo')]");

    By btnCCPlus= By.xpath("//button[@data-testid='ClientActivities_add_button']");

    By btnCreateCCActivity = By.xpath("//button[@data-testid='testIdSubmit']");

    //###########################################ACTIONS###################################################

    public void clickBtnOpenSearch() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnOpenSearch).click();
    }

    public void getTxtSearchField(String text) throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtSearchField).sendKeys(text);
    }

    public void clickBtnCCScrollable() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnScrollableClientContacts).click();
    }

    public void clickLnkClientItem() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkClient_item).click();
    }

    public void clickBtnCCPlus() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnCCPlus).click();
    }


    public void clickBtnCreateCCActivity() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnCreateCCActivity).click();
    }
}

