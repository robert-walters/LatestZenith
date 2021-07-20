package PageObjects.Sprint35;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreatePlacedTransitionModal_ViewOnALPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'Change Stage')]")
    @CacheLookup
    public WebElement btnChangeStage;

    @FindBy(xpath = "//h6[contains(text(), 'Place')]")
    @CacheLookup
    public WebElement lnkOffer;

    @FindBy(xpath = "//button[@data-testid='testIdSubmit']")
    @CacheLookup
    public WebElement btnSaveToPlaced;

    @FindBy(xpath = "//button[@data-testid='link-action']")
    @CacheLookup
    public WebElement btnDone;

    @FindBy(xpath = "//button[@data-testid='link-action']")
    @CacheLookup
    public WebElement lnkPlaced;

    @FindBy(xpath = "//h6[contains(text(), 'Tabitha Nelson')]")
    @CacheLookup
    public WebElement lnkCandidateRecord;

    public CreatePlacedTransitionModal_ViewOnALPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
