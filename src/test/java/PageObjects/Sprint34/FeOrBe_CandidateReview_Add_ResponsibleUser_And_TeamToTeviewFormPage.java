package PageObjects.Sprint34;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FeOrBe_CandidateReview_Add_ResponsibleUser_And_TeamToTeviewFormPage extends BasePage {

    @FindBy(xpath = "//h6[contains(text(), 'Candidate Review')]")
    @CacheLookup
    public WebElement btnCandidateReview;

    @FindBy(id = "Responsible-user-lookup")
    @CacheLookup
    public WebElement txtResponsibleUser;

    @FindBy(xpath = "//li[contains(text(), 'Test Users')]")
    @CacheLookup
    public WebElement txtResponsibleTeam_item;

    @FindBy(name = "notes")
    @CacheLookup
    public WebElement txtNotes;

    @FindBy(xpath = "//button[@data-testid='testIdSubmit']")
    @CacheLookup
    public WebElement btnCreateCandidateReview;


    public FeOrBe_CandidateReview_Add_ResponsibleUser_And_TeamToTeviewFormPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
