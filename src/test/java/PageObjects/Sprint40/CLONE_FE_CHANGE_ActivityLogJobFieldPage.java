package PageObjects.Sprint40;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CLONE_FE_CHANGE_ActivityLogJobFieldPage extends BasePage {

    @FindBy(xpath = "//button[@data-testid='editActivity']")
    @CacheLookup
    public WebElement btnEditActivity;

    @FindBy(xpath = "//div[@data-testid='card-header']//button")
    @CacheLookup
    public WebElement btnEditPosition;

    @FindBy(xpath = "//p[contains(text(), 'Edit this position')]")
    @CacheLookup
    public WebElement btnEditThisPosition;


    public CLONE_FE_CHANGE_ActivityLogJobFieldPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
