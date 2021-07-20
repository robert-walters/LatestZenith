package PageObjects.Sprint35;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CandidateNotAbleToAddARequiredQualificationOnlyPage extends BasePage {

    @FindBy(xpath = "//button[@data-testid='qualifications_add_button']")
    @CacheLookup
    public WebElement btnQualificationPlus;

    @FindBy(name = "name")
    @CacheLookup
    public WebElement txtQualificationName;

    @FindBy(name = "name")
    @CacheLookup
    public WebElement btnCreateQualification;

    public CandidateNotAbleToAddARequiredQualificationOnlyPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
