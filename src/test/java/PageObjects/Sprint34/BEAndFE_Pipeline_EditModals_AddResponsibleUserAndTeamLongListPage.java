package PageObjects.Sprint34;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeamLongListPage extends BasePage {
    @FindBy(xpath = "//p[contains(text(), 'Long list')]")
    @CacheLookup
    public WebElement lnkLongList;

    public BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeamLongListPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
