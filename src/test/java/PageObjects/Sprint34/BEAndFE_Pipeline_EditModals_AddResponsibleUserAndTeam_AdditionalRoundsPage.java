package PageObjects.Sprint34;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_AdditionalRoundsPage extends BasePage {

    @FindBy(xpath = "//p[contains(text(), 'Additional rounds')]")
    @CacheLookup
    public WebElement lnkAdditionalRound;


    public BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_AdditionalRoundsPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
