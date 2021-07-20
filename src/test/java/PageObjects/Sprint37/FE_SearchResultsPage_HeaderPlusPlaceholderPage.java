package PageObjects.Sprint37;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_SearchResultsPage_HeaderPlusPlaceholderPage extends BasePage {

    @FindBy(xpath = "")
    @CacheLookup
    public WebElement lnkSeeAll;

    public FE_SearchResultsPage_HeaderPlusPlaceholderPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
