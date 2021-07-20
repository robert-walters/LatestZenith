package PageObjects.Sprint37;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_CandidateListLibrary_DisplayOneNameColumnPage extends BasePage {

    @FindBy(xpath = "//h6[contains(text(), 'Name')]")
    @CacheLookup
    public WebElement txtHeaderName;

    public FE_CandidateListLibrary_DisplayOneNameColumnPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
