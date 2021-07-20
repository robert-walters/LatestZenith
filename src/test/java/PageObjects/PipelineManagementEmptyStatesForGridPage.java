package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PipelineManagementEmptyStatesForGridPage extends BasePage{

    @FindBy(xpath = "//h4[contains(text(), 'Director, Strategic Partnerships')]")
    @CacheLookup
    public WebElement lnkJobItem;

    @FindBy(xpath = "//span[@data-testid='record-check-all']")
    @CacheLookup
    public WebElement rdButton;

    @FindBy(xpath = "//span[contains(text(), 'Change Stage')]")
    @CacheLookup
    public WebElement btnChangeState;

    public PipelineManagementEmptyStatesForGridPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
