package PageObjects.Sprint30;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts_Candidate_EditExistingAlertPage extends BasePage {

    @FindBy(xpath = "//button[@data-testid='testIdSubmit']")
    @CacheLookup
    public WebElement btnSave;

    public Alerts_Candidate_EditExistingAlertPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
