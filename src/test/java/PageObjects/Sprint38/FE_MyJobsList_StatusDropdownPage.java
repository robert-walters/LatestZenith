package PageObjects.Sprint38;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_MyJobsList_StatusDropdownPage extends BasePage {

    @FindBy(xpath = "//p[contains(text(), 'LungaAuto')]")
    @CacheLookup
    public WebElement lnkJobItem;

    @FindBy(id = "scrollable-auto-tab-2")
    @CacheLookup
    public WebElement lnkPersonalTab;

    @FindBy(xpath = "/html/body/div/div[1]/div[1]/div[4]/div/div[2]/div/div/div/div[1]/div[1]/div[2]/div/div/div/div[6]/div/button/div/div/div")
    @CacheLookup
    public WebElement btnGender;

    public FE_MyJobsList_StatusDropdownPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
