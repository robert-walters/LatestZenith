package PageObjects.Sprint37;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_Organisation_SearchForAnOrganisationRecordByNamePage extends BasePage {

    @FindBy(id = "scrollable-auto-tab-Organisations")
    @CacheLookup
    public WebElement btnScrollableOrganisation;

    @FindBy(xpath = "//span[contains(text(), 'United Kingdom • Live Jobs: 4')]")
    @CacheLookup
    public WebElement lnkOrganisationRecord;

    public FE_Organisation_SearchForAnOrganisationRecordByNamePage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
