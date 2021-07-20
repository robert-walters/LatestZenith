package PageObjects.Sprint37;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_AddToJob_DisplayOnlyJobsAssociatedWithLoggedInUserPage extends BasePage {

    @FindBy(xpath = "//h6[contains(text(), 'Lunga Lunga')]")
    @CacheLookup
    public WebElement lnkCandidateItem;

    @FindBy(xpath = "//h6[contains(text(), 'Add to job')]")
    @CacheLookup
    public WebElement btnAddToJob;

    @FindBy(name = "c9e3d1ff-f084-4a64-8034-24efa638918a")
    @CacheLookup
    public WebElement rdBtnJob_item;

    @FindBy(xpath = "//button[@data-testid='testIdSubmit']")
    @CacheLookup
    public WebElement getBtnAddToJob;

    public FE_AddToJob_DisplayOnlyJobsAssociatedWithLoggedInUserPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
