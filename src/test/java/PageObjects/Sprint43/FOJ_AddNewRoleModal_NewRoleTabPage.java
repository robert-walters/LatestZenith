package PageObjects.Sprint43;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FOJ_AddNewRoleModal_NewRoleTabPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'New Role')]")
    @CacheLookup
    public WebElement btnNewRole;

    @FindBy(xpath = "//span[contains(text(), 'Select')]")
    @CacheLookup
    public WebElement btnSelect;

    public FOJ_AddNewRoleModal_NewRoleTabPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
