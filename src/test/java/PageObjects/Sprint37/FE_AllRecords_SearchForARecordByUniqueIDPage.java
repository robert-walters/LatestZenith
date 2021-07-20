package PageObjects.Sprint37;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_AllRecords_SearchForARecordByUniqueIDPage extends BasePage {

    @FindBy(xpath = "//button[@data-testid='openSearch']")
    @CacheLookup
    public WebElement btnOpenSearch;

    @FindBy(xpath = "//input[@type='search']")
    @CacheLookup
    public WebElement txtSearchField;

    @FindBy(id = "scrollable-auto-tab-Client Contacts")
    @CacheLookup
    public WebElement btnScrollableClientContacts;

    public FE_AllRecords_SearchForARecordByUniqueIDPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
