package PageObjects.Sprint30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEPermissionsRoleBasedJobPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FEPermissionsRoleBasedJobPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By btnSave = By.xpath("//span[contains(text(), 'Save')]");

    //###################################################ACTIONS########################################################

    public void clicksBtnSave() throws Exception{
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnSave).click();
    }
}
