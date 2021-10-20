package PageObjects.Sprint39;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_JobRearchResults_AddMissingFieldRateTypePage extends BasePage {

    @FindBy(xpath = "//p[contains(text(), 'LungaAuto')]")
    @CacheLookup
    public WebElement lnkJobItem;

    @FindBy(xpath = "//span[contains(text(), 'INFORMATION')]")
    @CacheLookup
    public WebElement lnkInformationTab;

    public FE_JobRearchResults_AddMissingFieldRateTypePage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
