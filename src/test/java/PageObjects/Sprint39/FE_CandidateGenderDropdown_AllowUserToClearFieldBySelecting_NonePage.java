package PageObjects.Sprint39;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_CandidateGenderDropdown_AllowUserToClearFieldBySelecting_NonePage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'PERSONAL')]")
    @CacheLookup
    public WebElement lnkPersonalTab;

    @FindBy(xpath = "//span[contains(text(), 'Female')]")
    @CacheLookup
    public WebElement txtGenderField;

    @FindBy(xpath = "//span[contains(text(), 'None')]")
    @CacheLookup
    public WebElement txtGenderFieldItem;


    public FE_CandidateGenderDropdown_AllowUserToClearFieldBySelecting_NonePage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
