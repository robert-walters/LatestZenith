package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientPlusButtonTopAddClientToListNewList {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public ClientPlusButtonTopAddClientToListNewList(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    @FindBy(xpath = "")
    @CacheLookup
    WebElement LnkClient;

    //    @FindBy(xpath = "//div[@role='grid']//div[9]")
//    @CacheLookup
//    WebElement LnkClientItem;
    //By LnkClientItem = By.xpath("//div[@role='grid']//div[9]");
    By LnkClientItem = By.xpath("");

    By btnNewList = By.xpath("");

    By txtListName= By.xpath("");

    By btnCreate= By.xpath("//button[@data-testid='testIdSubmit']");

    //#######################################################ACTIONS################################################

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

    public void btnNewList() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnNewList).click();
    }

    public void setTxtListName(String listName) throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtListName).sendKeys(listName);
    }

    public void clickBtnCreate() {

        ldriver.findElement(btnCreate).click();
    }
}
