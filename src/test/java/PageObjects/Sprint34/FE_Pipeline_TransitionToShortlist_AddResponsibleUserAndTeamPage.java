package PageObjects.Sprint34;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_Pipeline_TransitionToShortlist_AddResponsibleUserAndTeamPage extends BasePage {
    @FindBy(xpath = "//p[contains(text(), '1st round')]")
    @CacheLookup
    public WebElement txtResponsibleTeam_item;

    @FindBy(xpath = "//span[contains(text(), 'Change Stage')]")
    @CacheLookup
    public WebElement btnChangeStage;

    @FindBy(xpath = "//h6[contains(text(), 'Short list')]")
    @CacheLookup
    public WebElement lnkShortList;

    public FE_Pipeline_TransitionToShortlist_AddResponsibleUserAndTeamPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
