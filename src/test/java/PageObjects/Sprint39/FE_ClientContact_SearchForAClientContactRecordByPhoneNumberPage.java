package PageObjects.Sprint39;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_ClientContact_SearchForAClientContactRecordByPhoneNumberPage extends BasePage {

    @FindBy(xpath = "//p[contains(text(), 'Automation (Do not delete) LungaCa')]")
    @CacheLookup
    public WebElement lnkClientContactItem;

    @FindBy(id = "scrollable-auto-tab-2")
    @CacheLookup
    public WebElement lnkPersonalTab;

    @FindBy(xpath = "/html/body/div/div[1]/div[1]/div[4]/div/div[2]/div/div/div/div[1]/div[1]/div[2]/div/div/div/div[6]/div/button/div/div/div")
    @CacheLookup
    public WebElement btnGender;

    public FE_ClientContact_SearchForAClientContactRecordByPhoneNumberPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
