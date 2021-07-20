package PageObjects.Sprint34;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlacedEditActivityLog_NotUpdatingSalaryPage extends BasePage {

    @FindBy(name = "value")
    @CacheLookup
    public WebElement txtSalaryField;

    @FindBy(xpath = "//button[@data-testid='testIdSubmit']")
    @CacheLookup
    public WebElement btnSaveActivity;

    public PlacedEditActivityLog_NotUpdatingSalaryPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
