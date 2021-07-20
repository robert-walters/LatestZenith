package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEAndBETransitionToCVSentStageSingleOrMultiPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FEAndBETransitionToCVSentStageSingleOrMultiPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By btnSendCV= By.xpath("//h6[contains(text(), 'Send CV')]");

    By txtResponsibleUser= By.id("Responsible-user-lookup");

    By txtResponsibleUserItem= By.xpath("//h6[contains(text(), 'Ajesh Jally')]");

    By txtClientContact = By.id("client-lookup");

    @FindBy(xpath = "//span[contains(text(), 'Lunga • Automation Engineer • Johannesburg')]")
    @CacheLookup
    public WebElement txtClientContactItem;

    By btnSave = By.xpath("//button[@data-testid='transition_to_cv_sentSubmit']");

    //###########################################ACTIONS###################################################

    public void clickBtnSendCV() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnSendCV).click();
    }

    public void setTxtResponsibleUser() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtResponsibleUser).click();
    }

    public void setTxtResponsibleUserItem() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtResponsibleUserItem).click();
    }

    public void setTxtClientContact() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtClientContact).click();
    }

    public void setTxtClientContactItem() throws Exception{
        Thread.sleep(3000);
        //WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        wait.until(ExpectedConditions.visibilityOf(txtClientContactItem));
        txtClientContactItem.click();
    }



    public void clickBtnSave() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnSave).click();
    }

}


