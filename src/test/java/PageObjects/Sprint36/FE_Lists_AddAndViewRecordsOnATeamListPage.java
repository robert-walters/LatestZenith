package PageObjects.Sprint36;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_Lists_AddAndViewRecordsOnATeamListPage extends BasePage {

    @FindBy(xpath = "//h6[contains(text(), 'Add to list')]")
    @CacheLookup
    public WebElement btnAddToList;

    @FindBy(xpath = "//h4[contains(text(), 'Lunga')]")
    @CacheLookup
    public WebElement lnkList;

    @FindBy(xpath = "//button[@data-testid='testIdSubmit']")
    @CacheLookup
    public WebElement btnAdd;

    public FE_Lists_AddAndViewRecordsOnATeamListPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
