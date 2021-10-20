package PageObjects.Sprint30;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Organisation_DeleteAlertDialogueBox_Ok_ButtonIssuePage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'United Kingdom • Live Jobs: 3')]")
    @CacheLookup
    public WebElement lnkOrganisationItem;

    public Organisation_DeleteAlertDialogueBox_Ok_ButtonIssuePage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
