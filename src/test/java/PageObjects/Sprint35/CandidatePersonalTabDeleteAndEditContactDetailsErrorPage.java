package PageObjects.Sprint35;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CandidatePersonalTabDeleteAndEditContactDetailsErrorPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'PERSONAL')]")
    @CacheLookup
    public WebElement lnkPersonalTab;

    @FindBy(xpath = "//div[@data-testid='card-content']//input")
    @CacheLookup
    public WebElement contactDetailsTextField;

    public CandidatePersonalTabDeleteAndEditContactDetailsErrorPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
