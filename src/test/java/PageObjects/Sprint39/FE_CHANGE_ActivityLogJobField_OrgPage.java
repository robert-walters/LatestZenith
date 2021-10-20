package PageObjects.Sprint39;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_CHANGE_ActivityLogJobField_OrgPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'United Kingdom • Live Jobs: 4')]")
    @CacheLookup
    public WebElement lnkOrganisationItem;

    @FindBy(xpath = "//button[@data-testid='ActivityTab-Organisations_add_button']")
    @CacheLookup
    public WebElement btnActivityPlus;

    @FindBy(xpath = "")
    @CacheLookup
    public WebElement txtJobField;

    public FE_CHANGE_ActivityLogJobField_OrgPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
