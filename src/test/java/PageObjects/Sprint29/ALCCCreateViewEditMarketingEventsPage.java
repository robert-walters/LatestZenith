package PageObjects.Sprint29;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ALCCCreateViewEditMarketingEventsPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public ALCCCreateViewEditMarketingEventsPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By btnActivityTpe_menu = By.xpath("//div[@data-testid='activity-type']");

    //By lnkActivityType_menuitem = By.xpath("//span[contains(text(), 'Automated Survey')]");

    @FindBy(xpath = "//span[contains(text(), 'Client Call')]")
    @CacheLookup
    public WebElement lnkActivityType_menuitem;

    //###########################################ACTIONS################################################################

    public void clickActivityTypeMenu() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnActivityTpe_menu).click();
    }

    public void clickActivityTypeItem() throws Exception{
        Thread.sleep(3000);
//        wait.until(ExpectedConditions.visibilityOf(lnkActivityType_menuitem));
//        lnkActivityType_menuitem.click();

        //wait.until(ExpectedConditions.visibilityOf(lnkActivityType_menuitem));
        ldriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement element = ldriver.findElement(By.xpath("//span[contains(text(), 'Client Call')]"));
        JavascriptExecutor executor = (JavascriptExecutor)ldriver;
        executor.executeScript("arguments[0].click();", element);

    }


}
