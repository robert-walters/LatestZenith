package PageObjects.Sprint30;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts_Candidate_ArchiveAlertPage extends BasePage {

    @FindBy(xpath = "//button[@data-testid='deleteButton']")
    @CacheLookup
    public WebElement btnDelete;

    public Alerts_Candidate_ArchiveAlertPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }

}
