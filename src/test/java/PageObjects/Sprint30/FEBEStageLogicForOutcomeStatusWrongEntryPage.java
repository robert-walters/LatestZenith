package PageObjects.Sprint30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEBEStageLogicForOutcomeStatusWrongEntryPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FEBEStageLogicForOutcomeStatusWrongEntryPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By lnkJobItem = By.xpath("//h4[contains(text(), 'Abby Job Two')]");


    //######################################ACTIONS#####################################################


    public void clickLnkJobItem() throws Exception{
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkJobItem).click();
    }
}
