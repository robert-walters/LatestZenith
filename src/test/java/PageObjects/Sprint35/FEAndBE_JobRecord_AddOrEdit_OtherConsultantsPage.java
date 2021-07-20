package PageObjects.Sprint35;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEAndBE_JobRecord_AddOrEdit_OtherConsultantsPage extends BasePage {

    @FindBy(xpath = "//p[contains(text(), 'LungaAuto')]")
    @CacheLookup
    public WebElement lnkJobItem;

    @FindBy(xpath = "//button[@data-testid='internal_information_edit_button']")
    @CacheLookup
    public WebElement btnInternalInformationEdit;

    @FindBy(xpath = "//h6[contains(text(), 'Alex Berry')]")
    @CacheLookup
    public WebElement btnOtherConsultants_item;

    @FindBy(xpath = "//h6[contains(text(), 'Ajesh Jally')]")
    @CacheLookup
    public WebElement btnOtherConsultants_itemTwo;

    public FEAndBE_JobRecord_AddOrEdit_OtherConsultantsPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
