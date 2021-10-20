package PageObjects.Sprint43;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_ClientContact_CreateActivityEventFilterComponentInStorybookPage extends BasePage {

    @FindBy(xpath = "//button[@data-cy='dropDown']")
    @CacheLookup
    public WebElement activityDateDropdown;

    @FindBy(xpath = "//label[contains(text(), 'Start date')]")
    @CacheLookup
    public WebElement startDate;

    @FindBy(xpath = "//span[contains(text(), 'OK')]")
    @CacheLookup
    public WebElement btnOK;

    @FindBy(xpath = "//label[contains(text(), 'End date')]")
    @CacheLookup
    public WebElement endDate;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div[2]/div/div[5]/div[4]/button/span[1]/p")
    @CacheLookup
    public WebElement btnselectDate;

    @FindBy(xpath = "//span[contains(text(), 'Ok')]")
    @CacheLookup
    public WebElement btnActivityOK;

    public FE_ClientContact_CreateActivityEventFilterComponentInStorybookPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
