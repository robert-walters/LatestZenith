package PageObjects.Sprint30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FECandidateRecordPreviewPanelRefactorPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FECandidateRecordPreviewPanelRefactorPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By lnkJobItem = By.xpath("//h4[contains(text(), 'Lunga')]");

    By lnkCandidate = By.xpath("//h6[contains(text(), 'Chloe  Miller')]");

    By btnExpand = By.xpath("//a[@data-testid='expandButton']");

    By btnBack = By.xpath("");

    By btnX = By.xpath("/html/body/div/div/div[1]/div[4]/div/div[2]/div/div[1]/div[1]/button");


    //######################################ACTIONS#####################################################


    public void clickJobItem(String jobItem) throws Exception{
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkJobItem).click();
    }

    public void clickLnkCandidate(){
        ldriver.findElement(lnkCandidate).click();
    }

    public void clickBtnExpand(){
        ldriver.findElement(btnExpand).click();
    }


    public void clickBtnBack(){
        ldriver.findElement(btnBack).click();
    }

    public void clickBtnX(){
        ldriver.findElement(btnX).click();
    }

}
