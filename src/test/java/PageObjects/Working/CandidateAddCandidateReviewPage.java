package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CandidateAddCandidateReviewPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public CandidateAddCandidateReviewPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    @FindBy(xpath = "//button[@data-testid='addToButton']")
    @CacheLookup
    WebElement btnPlusTop;
    By by_of_btnPlusTop = By.xpath("//button[@data-testid='addToButton']");

    By btnCandidateReview = By.xpath("//ul[@role='menu']//li[4]");

    By txtNotesReview = By.name("notes");

    By btnCreate = By.xpath("//button[@data-testid='addToCandidateReviewSubmit']");


    //######################################ACTIONS#####################################################


    public void clickPlusBtnTop() {
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        btnPlusTop.click();
    }

    public void clickBtnCandidateReview(){
        ldriver.findElement(btnCandidateReview).click();
    }

    public void setTxtNotesReview(String textReview){
        ldriver.findElement(txtNotesReview).sendKeys(textReview);
    }

    public void clickBtnCreate(){
        ldriver.findElement(btnCreate).click();
    }
}
