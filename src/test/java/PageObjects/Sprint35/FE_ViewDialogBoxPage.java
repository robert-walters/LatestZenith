package PageObjects.Sprint35;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_ViewDialogBoxPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'Change Stage')]")
    @CacheLookup
    public WebElement btnChangeStage;

    @FindBy(xpath = "//li[@tabindex='0']")
    @CacheLookup
    public WebElement lnkPlaced;

    public FE_ViewDialogBoxPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
