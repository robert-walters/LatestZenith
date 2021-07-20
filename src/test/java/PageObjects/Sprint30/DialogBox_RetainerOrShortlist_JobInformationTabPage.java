package PageObjects.Sprint30;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DialogBox_RetainerOrShortlist_JobInformationTabPage extends BasePage {

    @FindBy(xpath = "//p[contains(text(), 'LungaAuto')]")
    @CacheLookup
    public WebElement lnkJobItem;

    @FindBy(id = "scrollable-auto-tab-3")
    @CacheLookup
    public WebElement lnkInformationTab;

    @FindBy(xpath = "/html/body/div/div/div[1]/div[4]/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div/button/div/div/div/div")
    @CacheLookup
    public WebElement txtAgreementType;

    @FindBy(xpath = "//span[contains(text(), 'Retainer / Shortlist')]")
    @CacheLookup
    public WebElement lnkAgreementType_item;

    public DialogBox_RetainerOrShortlist_JobInformationTabPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
