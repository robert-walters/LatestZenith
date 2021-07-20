package PageObjects.Sprint38;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_ImplementStandardAndValidationOnPhoneNumberInputPage extends BasePage {

    @FindBy(name = "first_name")
    @CacheLookup
    public WebElement txtFirstNameField;

    @FindBy(name = "family_name")
    @CacheLookup
    public WebElement txtFamilyNameField;

    @FindBy(xpath = "//button[@data-testid='addContactButton']")
    @CacheLookup
    public WebElement btnContactDetailsPlus;

    @FindBy(xpath = "//li[@data-testid='mobile-contact-option']")
    @CacheLookup
    public WebElement lnkMobileNumber;

    @FindBy(name = "value")
    @CacheLookup
    public WebElement txtMobileNumberField;

    @FindBy(name = "role.job_title")
    @CacheLookup
    public WebElement txtJobTitle;



    public FE_ImplementStandardAndValidationOnPhoneNumberInputPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
