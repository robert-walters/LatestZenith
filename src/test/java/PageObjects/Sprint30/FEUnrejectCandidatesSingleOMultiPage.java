package PageObjects.Sprint30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEUnrejectCandidatesSingleOMultiPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FEUnrejectCandidatesSingleOMultiPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By btnUnreject = By.xpath("//span[contains(text(), 'Unreject')]");


    //######################################ACTIONS#####################################################


    public void clickBtnUnreject() throws Exception{
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnUnreject).click();
    }
}
