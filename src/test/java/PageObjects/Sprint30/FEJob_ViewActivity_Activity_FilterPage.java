package PageObjects.Sprint30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEJob_ViewActivity_Activity_FilterPage {

    public WebDriver ldriver;
    public WebDriverWait wait;

    public FEJob_ViewActivity_Activity_FilterPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By lnkActivityTab= By.xpath("//span[contains(text(), 'ACTIVITY')]");

    By btnFilterTypeItem = By.xpath("//span[contains(text(), 'Job Stage')]");


    //###########################################ACTIONS################################################################

    public void clickLnkActivityTab() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkActivityTab).click();
    }

    public void clickActivityTypeItem() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnFilterTypeItem).click();
    }
}
