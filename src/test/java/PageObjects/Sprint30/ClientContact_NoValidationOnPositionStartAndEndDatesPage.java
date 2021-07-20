package PageObjects.Sprint30;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientContact_NoValidationOnPositionStartAndEndDatesPage extends BasePage {

    @FindBy(xpath = "//p[contains(text(), 'Lunga Lunga')]")
    @CacheLookup
    public WebElement lnkClientContact;

    @FindBy(xpath = "//span[contains(text(), 'INFORMATION')]")
    @CacheLookup
    public WebElement lnkInformationTab;

    public ClientContact_NoValidationOnPositionStartAndEndDatesPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
