package PageObjects.Sprint37;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_Lists_AddAndViewRecordsOnATeamListPage extends BasePage {

    @FindBy(name = "//h6[contains(text(), 'lungas lungas')]")
    @CacheLookup
    public WebElement lnkCandidate_item;


    @FindBy(xpath = "//h4[contains(text(), 'Lunga')]")
    @CacheLookup
    public WebElement btnListItem;

    @FindBy(name = "//button[@data-testid='testIdSubmit']")
    @CacheLookup
    public WebElement btnAdd;

    @FindBy(name = "//h4[contains(text(), 'Lunga List')]")
    @CacheLookup
    public WebElement lnkContactList_item;

    public FE_Lists_AddAndViewRecordsOnATeamListPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
