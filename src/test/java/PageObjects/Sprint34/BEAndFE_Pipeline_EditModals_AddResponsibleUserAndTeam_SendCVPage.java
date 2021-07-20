package PageObjects.Sprint34;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_SendCVPage extends BasePage {


    @FindBy(xpath = "//p[contains(text(), 'LungaTwo')]")
    @CacheLookup
    public WebElement lnkJobItem;

    @FindBy(xpath = "//p[contains(text(), 'CV Sent')]")
    @CacheLookup
    public WebElement lnkCVSent;

    public BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_SendCVPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
