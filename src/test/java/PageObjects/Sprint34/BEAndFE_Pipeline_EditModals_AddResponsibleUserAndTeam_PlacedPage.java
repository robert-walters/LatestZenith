package PageObjects.Sprint34;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_PlacedPage extends BasePage {
    @FindBy(xpath = "//p[contains(text(), 'Placed')]")
    @CacheLookup
    public WebElement lnkPlaced;

    @FindBy(xpath = "//h6[contains(text(), 'Ajesh Jally')]")
    @CacheLookup
    public WebElement txtResponsibleUser_item;

    public BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_PlacedPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
