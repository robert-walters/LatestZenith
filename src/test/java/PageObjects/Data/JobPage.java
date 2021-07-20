package PageObjects.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JobPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public JobPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By txtBackgroundInfo = By.name("background_information");

    By btnCreate = By.xpath("//button[@data-testid='testIdSubmit']");


    //###########################################ACTIONS################################################################

    public void setTxtBackgroundInfo(String backgroundInfo) throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtBackgroundInfo).sendKeys(backgroundInfo);
    }

    public void clickOnBtnCreate() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnCreate).click();
    }
}
