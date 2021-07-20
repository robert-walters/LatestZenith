package PageObjects.Sprint34;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEAndBECandidateStatusNotUpdatingOrSettingToCorrectDefaultValuePage extends BasePage {

    @FindBy(xpath = "//h6[contains(text(), 'Lunga Lunga')]")
    @CacheLookup
    public WebElement lnkCandidate_item;

    @FindBy(xpath = "//button[@data-testid='dropdown']")
    @CacheLookup
    public WebElement btnStatusDropdown;



    public FEAndBECandidateStatusNotUpdatingOrSettingToCorrectDefaultValuePage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
