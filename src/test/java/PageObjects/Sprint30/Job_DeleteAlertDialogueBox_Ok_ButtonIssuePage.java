package PageObjects.Sprint30;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Job_DeleteAlertDialogueBox_Ok_ButtonIssuePage extends BasePage {

    @FindBy(xpath = "//p[contains(text(), 'LungaTwo')]")
    @CacheLookup
    public WebElement lnkJobItem;

    @FindBy(xpath = "//h6[contains(text(), 'Caution')]")
    @CacheLookup
    public WebElement btnAlert;

    public Job_DeleteAlertDialogueBox_Ok_ButtonIssuePage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
