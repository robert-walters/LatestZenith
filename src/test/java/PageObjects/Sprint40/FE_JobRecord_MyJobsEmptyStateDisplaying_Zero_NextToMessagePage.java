package PageObjects.Sprint40;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_JobRecord_MyJobsEmptyStateDisplaying_Zero_NextToMessagePage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'COMPLETED')]")
    public WebElement btnCompletedTab;

    public FE_JobRecord_MyJobsEmptyStateDisplaying_Zero_NextToMessagePage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
