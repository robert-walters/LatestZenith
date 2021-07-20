package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JobsEditActivityPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public JobsEditActivityPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver, 10);
    }

    //By lnkMyJobs = By.xpath("//a[@data-testid='myJobsLink']");
    @FindBy(xpath = "//a[@data-testid='myJobsLink']")
    @CacheLookup
    public WebElement lnkMyJobs;

    By lnkJobItem = By.xpath("//h4[contains(text(), 'LungaAuto')]");

    By lnkActivity = By.id("scrollable-auto-tab-2");

    By lnkEditJobActivity = By.xpath("//button[@data-testid='testIdSubmit']");

    //##################################################ACTIONS##########################################################

    public void clickLnkMyJobs() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        wait.until(ExpectedConditions.visibilityOf(lnkMyJobs));
        lnkMyJobs.click();
    }

    public void clickLnkJobItem() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkJobItem).click();
    }

    public void clickLnkActivity() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkActivity).click();
    }

    public void clickLnkEditActivity() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkEditJobActivity).click();
    }


}
