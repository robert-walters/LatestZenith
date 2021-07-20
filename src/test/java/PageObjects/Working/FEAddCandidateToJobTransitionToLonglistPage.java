package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEAddCandidateToJobTransitionToLonglistPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FEAddCandidateToJobTransitionToLonglistPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By lnkCandidate_item = By.xpath("//h6[contains(text(), 'Lunga Lunga')]");

    By btnAddToListOrJob = By.xpath("//span[contains(text(), 'Add To List/Job')]");

    By btnAddToJob = By.xpath("//h6[contains(text(), 'Add to job')]");

    By rdBtnJobItem= By.xpath("//h4[contains(text(), 'LungaTwo')]");

    By btnAdd = By.xpath("//button[@data-testid='testIdSubmit']");

    //##########################################ACTIONS################################################

    public void clickLnkCandidateItem() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkCandidate_item).click();
    }

    public void clickBtnAddToListOrJob() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnAddToListOrJob).click();
    }

    public void clickBtnAddToJob() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnAddToJob).click();
    }

    public void clickRdBtnJobItem() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(rdBtnJobItem).click();
    }

    public void clickBtnAdd() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnAdd).click();
    }


}
