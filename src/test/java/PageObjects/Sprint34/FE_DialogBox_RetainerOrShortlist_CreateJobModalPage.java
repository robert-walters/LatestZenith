package PageObjects.Sprint34;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_DialogBox_RetainerOrShortlist_CreateJobModalPage extends BasePage {

    @FindBy(xpath = "//div[@data-testid='jobStatusDropdown']")
    @CacheLookup
    public WebElement jobStatus_menu;

    @FindBy(xpath = "//span[contains(text(), 'Live')]")
    @CacheLookup
    public WebElement jobStatus_menuitem;

    @FindBy(xpath = "//span[contains(text(), '162 Anderson Street, Johannesburg, GBR')]")
    @CacheLookup
    public WebElement txtLocation_menuitem;


    @FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[4]/span[1]/span")
    @CacheLookup
    public WebElement aggreementType_menuitem;

    @FindBy(xpath = "//input[@data-testid='target-fee']")
    @CacheLookup
    public WebElement txtFee;

    @FindBy(xpath = "//button[@data-testid='testIdSubmit']")
    @CacheLookup
    public WebElement btnCreateJob;


    public FE_DialogBox_RetainerOrShortlist_CreateJobModalPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
