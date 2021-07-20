package PageObjects.Sprint36;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_ClientContact_JobsTabErrorPage extends BasePage {

    @FindBy(xpath = "//h4[contains(text(), 'Lunga')]")
    @CacheLookup
    public WebElement lnkClientListItem;

    @FindBy(xpath = "//button[@data-testid='testIdSubmit']")
    @CacheLookup
    public WebElement btnUpdateKeyDetails;

    @FindBy(xpath = "//button[@data-cy='cancel_form']")
    @CacheLookup
    public WebElement btnCancel;

    @FindBy(xpath = "//button[@data-testid='discard-action']")
    @CacheLookup
    public WebElement btnOkay;

    public FE_ClientContact_JobsTabErrorPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
