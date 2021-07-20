package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientAddAlertPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public ClientAddAlertPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    @FindBy(xpath = "//a[@data-testid='allClientsLink']")
    @CacheLookup
    WebElement LnkClient;

    //    @FindBy(xpath = "//div[@role='grid']//div[9]")
//    @CacheLookup
//    WebElement LnkClientItem;
    By LnkClientItem = By.xpath("//h6[contains(text(), 'Aaa Client Acandi')]");

    By btnClientTopPlus = By.xpath("//button[@data-testid='addToButton']");

    By btnAddAlert= By.xpath("//li[@tabindex='-1']");

    By btnAlertType_menu= By.xpath("//label[@class='MuiFormLabel-root MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-outlined Mui-required Mui-required']");

    By btnAlertType_menuitem= By.xpath("//span[contains(text(), 'Placement')]");

    By btnAdd = By.xpath("//button[@data-testid='alertSubmit']");

    //##########################################ACTIONS################################################

    public void clickLnkClient() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        LnkClient.click();
    }

    public void click(WebElement element) {
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

    public void click(String css) {
        //https://code.google.com/p/selenium/issues/detail?id=2766 (fix)
        while(true){
            try{
                ldriver.findElement(LnkClientItem).click();
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

    public void clickBtnClientTopPlus() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnClientTopPlus).click();
    }

    public void clickBtnAddAlert() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnAddAlert).click();
    }

    public void clicksBtnAlertType() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnAlertType_menu).click();
        waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnAlertType_menuitem).click();
    }

    public void clickBtnAdd() {
        ldriver.findElement(btnAdd).click();
    }
}
