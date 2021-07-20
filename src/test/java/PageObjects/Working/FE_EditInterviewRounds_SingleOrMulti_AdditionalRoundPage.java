package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_EditInterviewRounds_SingleOrMulti_AdditionalRoundPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FE_EditInterviewRounds_SingleOrMulti_AdditionalRoundPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By btnCheckbox= By.xpath("//span[@data-testid='record-check-all']");



    //###########################################ACTIONS################################################

    public void clickBtnCheckbox() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnCheckbox).click();
    }

}
