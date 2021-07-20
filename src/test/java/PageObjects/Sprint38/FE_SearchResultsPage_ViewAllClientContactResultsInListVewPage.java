package PageObjects.Sprint38;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_SearchResultsPage_ViewAllClientContactResultsInListVewPage extends BasePage {

    @FindBy(xpath = "//h6[contains(text(), 'SEE ALL RESULTS')]")
    @CacheLookup
    public WebElement lnkSeeAllResults;



    public FE_SearchResultsPage_ViewAllClientContactResultsInListVewPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
