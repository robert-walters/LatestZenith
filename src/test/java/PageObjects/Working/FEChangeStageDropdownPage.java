package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEChangeStageDropdownPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FEChangeStageDropdownPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By lnkJobItem = By.xpath("//h4[contains(text(), 'Aaa Job')]");

    @FindBy(xpath = "//p[contains(text(), 'Short list')]")
    @CacheLookup
    WebElement lnkShortList;

    @FindBy(xpath = "//span[@data-testid='record-check-all']")
    @CacheLookup
    WebElement jobCheckboxItem;

    @FindBy(xpath = "//span[contains(text(), 'Change Stage')]")
    @CacheLookup
    WebElement lnkChangeStage;

    @FindBy(xpath = "//span[contains(text(), 'Reject')]")
    @CacheLookup
    WebElement btnReject;

   //###############################################ACTIONS##############################################

    public void clickOrganisation_menu(WebElement element) {
        //https://code.google.com/p/selenium/issues/detail?id=2766 (fix)
        while(true){
            try{
                element.click();
                break;
            }catch (Throwable e){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    public void clickLnkJobItem_menu(String css) {
        //https://code.google.com/p/selenium/issues/detail?id=2766 (fix)
        while(true){
            try{
                ldriver.findElement(lnkJobItem).click();
                break;
            }catch (Throwable e){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    public void clickLnkShortList() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        lnkShortList.click();
    }

    public void clickJobCheckboxItem() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);//span[contains(text(), 'Change Stage')]
        jobCheckboxItem.click();
    }

    public void clickLnkChangeStage() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        lnkChangeStage.click();
    }

    public void clickBtnReject() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        btnReject.click();
    }
}
