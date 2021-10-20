package PageObjects.Sprint39;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_CandidateLibrary_ShowLastContactedPage extends BasePage {

    @FindBy(xpath = "//h6[contains(text(), 'Construction Engineer')]")
    @CacheLookup
    public WebElement lnkCandidateItem;

    @FindBy(xpath = "/html/body/div/div/div[1]/div[4]/div/div[2]/div/div[1]/div[1]/button")
    @CacheLookup
    public WebElement btnX;

    public FE_CandidateLibrary_ShowLastContactedPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
