package PageObjects.Sprint39;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CLONE_FE_MyJobsList_StatusDropdownPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'Live')]")
    public WebElement btnStatusDropdown;

    public CLONE_FE_MyJobsList_StatusDropdownPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
