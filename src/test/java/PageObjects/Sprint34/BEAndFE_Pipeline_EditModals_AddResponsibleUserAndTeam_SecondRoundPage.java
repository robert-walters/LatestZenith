package PageObjects.Sprint34;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_SecondRoundPage extends BasePage {

    @FindBy(xpath = "//p[contains(text(), '2nd round')]")
    @CacheLookup
    public WebElement lnkSecondRound;

    @FindBy(xpath = "//h6[contains(text(), 'Alex Berry')]")
    @CacheLookup
    public WebElement txtResponsibleUser_item;

    public BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_SecondRoundPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
