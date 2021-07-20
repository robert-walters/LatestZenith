package PageObjects.Sprint37;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_Job_SearchForAJobByOrganisationNamePage extends BasePage {

    @FindBy(id = "scrollable-auto-tab-Jobs")
    @CacheLookup
    public WebElement btnScrollableJobTab;

    public FE_Job_SearchForAJobByOrganisationNamePage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
