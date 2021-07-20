package PageObjects.Sprint34;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEOrBEJobRecord_EditResponsibleUserPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'INFORMATION')]")
    @CacheLookup
    public WebElement btnInformationTab;



    @FindBy(xpath = "//button[@data-testid='internal_information_edit_button']")
    @CacheLookup
    public WebElement btnInternalInformation;

    public FEOrBEJobRecord_EditResponsibleUserPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
