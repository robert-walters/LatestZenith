package PageObjects.Sprint30;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Candidate_ErrorWhenCreatingAnAlertAfterClearingAnExpiryDatePage extends BasePage {

    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div/div/button")
    @CacheLookup
    public WebElement btnExpiryDateCalendar;

    @FindBy(xpath = "//span[contains(text(), 'Clear')]")
    @CacheLookup
    public WebElement btnClear;

    @FindBy(xpath = "//span[contains(text(), 'Save')]")
    @CacheLookup
    public WebElement btnSave;

    public Candidate_ErrorWhenCreatingAnAlertAfterClearingAnExpiryDatePage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
