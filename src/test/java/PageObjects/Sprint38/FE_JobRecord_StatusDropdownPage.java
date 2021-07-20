package PageObjects.Sprint38;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_JobRecord_StatusDropdownPage extends BasePage {

    @FindBy(xpath = "//button[@data-testid='dropdown']")
    @CacheLookup
    public WebElement btnStatusDropdown;



    public FE_JobRecord_StatusDropdownPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
