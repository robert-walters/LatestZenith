package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CandidateActivityAddNewActivityPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public CandidateActivityAddNewActivityPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver, 10);
    }

    By btnOpenSearch = By.xpath("//button[@data-testid='openSearch']");

    By txtSearchField = By.xpath("//input[@type='search']");


    By lnkCandidateItem = By.xpath("//p[contains(text(), 'Lunga Lunga')]");

    By lnkActivity = By.id("scrollable-auto-tab-1");

    @FindBy(xpath = "//button[@data-testid='ActivityTab-Candidates_add_button']")
    @CacheLookup
    WebElement btnActivityRolesPlus;

    By by_of_btnActivityRolesPlus = By.xpath("//button[@data-testid='ActivityTab-Candidates_add_button']");

    By btnActivityType_menu = By.xpath("//div[@data-testid='activity-type']");

    By by_of_btnActivityType_menu = By.xpath("//span[contains(text(), 'Candidate Call')]");


    By btnCreate = By.xpath("//button[@data-testid='testIdSubmit']");

    //##################################################ACTIONS##########################################################

    public void clickBtnSearch() {
        ldriver.findElement(btnOpenSearch).click();
    }

    public void getTxtSearch(String text) throws Exception{
        Thread.sleep(3000);
        ldriver.findElement(txtSearchField).sendKeys(text);
    }

    public void clickCandidateItem() {
        ldriver.findElement(lnkCandidateItem).click();
    }

    public void clickLnkActivity() {
        ldriver.findElement(lnkActivity).click();
    }

    public void clickBtnActivityRolesPlus() {
        wait.until(ExpectedConditions.presenceOfElementLocated(by_of_btnActivityRolesPlus));
        btnActivityRolesPlus.click();
    }

    public void clickBtnActivityType_menu() throws Exception {
        Thread.sleep(3000);

        //new WebDriverWait(ldriver, 15).until(ExpectedConditions.elementToBeClickable(lnkAgreementType_menu)).click();
        ldriver.findElement(btnActivityType_menu).click();
        ldriver.findElement(by_of_btnActivityType_menu).click();
    }



    public void clickBtnCreate() throws Exception{
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        Thread.sleep(5000);
        ldriver.findElement(btnCreate).click();
    }

}