package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_TransitionToInterviewRoundsFirstSecondnd_Add_SingleOrMultiPage extends BasePage{

    @FindBy(xpath = "//h4[contains(text(), 'Aaa Job')]")
    public WebElement lnkJobItem;

    @FindBy(xpath = "//p[contains(text(), '1st round')]")
    public WebElement lnkFirstRound;

    @FindBy(xpath = "//span[@data-testid='record-check-all']")
    public WebElement btnRadioButton;

    @FindBy(xpath = "//span[contains(text(), 'Change Stage')]")
    public WebElement btnChangeState;

    @FindBy(xpath = "//h6[contains(text(), '2nd Round')]")
    public WebElement btnSecoRoundTransition;

    @FindBy(xpath = "//span[contains(text(), 'Save')]")
    public WebElement btnSaveToTransition;

    public FE_TransitionToInterviewRoundsFirstSecondnd_Add_SingleOrMultiPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
