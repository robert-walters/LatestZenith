package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JobsAddAlertPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public JobsAddAlertPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    @FindBy(xpath = "//button[@data-testid='addToButton']")
    @CacheLookup
    WebElement btnTopPlus;





    By btnPlusTop = By.xpath("//button[@data-testid='addToButton']");

    By btnAddAlert = By.xpath("//li[@tabindex='0']");




    By btnType_menu = By.xpath("//div[@data-testid='alertType']");





    By btnType_menuitem = By.xpath("//span[contains(text(), 'Caution')]");

    By txtReason = By.name("reason");

    By btnExpiryDate = By.xpath("//div[@data-testid='Expiry date datePicker']");

    By btnOK = By.xpath("//span[contains(text(), 'OK')]");

    By btnAdd = By.xpath("//button[@data-testid='testIdSubmit']");

    //###############################################ACTIONS###########################################################

    public void clickBtnTopPlus() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        btnTopPlus.click();
    }



    public void clickBtnAddAlert() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnAddAlert).click();
    }

//    WebElement element = driver.findElement(By.id("gbqfd"));
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//    executor.executeScript("arguments[0].click();", element);

    public void clickType_menu() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnType_menu).click();
    }

    public void clickType_menuitem() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnType_menuitem).click();
    }

    public void stTxtReason(String city) {
        ldriver.findElement(txtReason).sendKeys(city);
    }

    public void clickOnBtnExpiryDate(){
        ldriver.findElement(btnExpiryDate).click();
    }

    public void clickOnBtnOK(){
        ldriver.findElement(btnOK).click();
    }

    public void clickOnBtnAdd(){
        ldriver.findElement(btnAdd).click();
    }
}
