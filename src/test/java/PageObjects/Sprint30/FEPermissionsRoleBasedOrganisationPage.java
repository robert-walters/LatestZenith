package PageObjects.Sprint30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEPermissionsRoleBasedOrganisationPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FEPermissionsRoleBasedOrganisationPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By lnkOrganisationItem = By.xpath("//h6[contains(text(), 'Telecommunications')]");

    //###################################################ACTIONS########################################################

    public void clickLnkOrganisationItem() throws Exception{
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkOrganisationItem).click();
    }
}
