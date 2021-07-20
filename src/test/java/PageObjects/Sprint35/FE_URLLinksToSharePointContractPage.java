package PageObjects.Sprint35;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_URLLinksToSharePointContractPage extends BasePage {

    @FindBy(xpath = "//h4[contains(text(), 'LungaTwo')]")
    @CacheLookup
    public WebElement lnkJobTwoItem;

    @FindBy(xpath = "//li[contains(text(), 'Test Users')]")
    @CacheLookup
    public WebElement txtResponsibleTeam_item;

    public FE_URLLinksToSharePointContractPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
