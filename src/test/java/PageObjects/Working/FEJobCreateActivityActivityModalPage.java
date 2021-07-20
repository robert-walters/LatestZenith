package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FEJobCreateActivityActivityModalPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FEJobCreateActivityActivityModalPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By btnJobPlus= By.xpath("//button[@data-testid='ActivityTab-Jobs_add_button']");

    By btnActivityType_menu = By.xpath("//div[@data-testid='activity-type']");

    By by_of_btnActivityType_menu = By.xpath("//span[contains(text(), 'Spec Digital Passport Sent (ANZ)')]");


    //###########################################ACTIONS###################################################


    public void clickBtnJobPlus() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnJobPlus).click();
    }

    public void clickBtnActivityType_menu() throws Exception {
        Thread.sleep(3000);

        //new WebDriverWait(ldriver, 15).until(ExpectedConditions.elementToBeClickable(lnkAgreementType_menu)).click();
        ldriver.findElement(btnActivityType_menu).click();
        ldriver.findElement(by_of_btnActivityType_menu).click();
    }

}
