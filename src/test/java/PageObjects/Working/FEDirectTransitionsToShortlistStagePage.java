package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEDirectTransitionsToShortlistStagePage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FEDirectTransitionsToShortlistStagePage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By lnJobItem = By.xpath("//p[contains(text(), 'Lunga')]");

    By lnkShortList = By.xpath("//h6[contains(text(), 'Short list')]");

    By lnkLeftPaneShortList = By.xpath("//p[contains(text(), 'Short list')]");


    //##########################################ACTIONS################################################

    public void clickLnkJobItem() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnJobItem).click();
    }

    public void clickLnkShortList() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkShortList).click();
    }

    public void clickLnkLeftPaneShortListt() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkLeftPaneShortList).click();
    }



}
