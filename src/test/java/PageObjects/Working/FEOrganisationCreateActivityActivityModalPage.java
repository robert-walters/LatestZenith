package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class FEOrganisationCreateActivityActivityModalPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public FEOrganisationCreateActivityActivityModalPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }
    By lnkOrganisationScrollable = By.id("scrollable-auto-tab-Organisations");

    By lnkOrganisation_item = By.xpath("//span[contains(text(), 'United Kingdom • Live Jobs: 3')]");


    By btnOrgPlus= By.xpath("//button[@data-testid='ActivityTab-Organisations_add_button']");

    By btnActivityType_menu = By.xpath("//div[@data-testid='activity-type']");

    By by_of_btnActivityType_menu = By.xpath("//span[contains(text(), 'Client Meeting')]");

    By txtMainClientContact_menu = By.id("client-lookup-label");

    By lnkMainClientContact_menuitem = By.xpath("//h6[contains(text(), 'Lunga Lunga')]");

    By btnCreateOrgActivity = By.xpath("//button[@data-testid='testIdSubmit']");


    //###########################################ACTIONS###################################################

    public void clickLnkOrganisationScrollable() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkOrganisationScrollable).click();
    }

    public void clickLnkOrganisationItem() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkOrganisation_item).click();
    }

    public void clickBtnOrgPlus() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnOrgPlus).click();
    }

    public void clickBtnActivityType_menu() throws Exception {
        Thread.sleep(3000);

        //new WebDriverWait(ldriver, 15).until(ExpectedConditions.elementToBeClickable(lnkAgreementType_menu)).click();
        ldriver.findElement(btnActivityType_menu).click();
        ldriver.findElement(by_of_btnActivityType_menu).click();
    }

    public void setTxtMainClientContact_menu(String mainClientContact) {
        ldriver.findElement(txtMainClientContact_menu).sendKeys(mainClientContact);
    }

    public void clickMainClientContactMenuItem() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        //wait.until(ExpectedConditions.visibilityOf((WebElement) lnkMainClientContact_menuitem));
        ldriver.findElement(lnkMainClientContact_menuitem).click();
    }

    public void clickMainClientContact_menuitem_firstOption() {
        //Wait until the list of options is present
        wait.until(ExpectedConditions.presenceOfElementLocated(txtMainClientContact_menu));
        //Initialize the Actions class
        Actions actions = new Actions(ldriver);
        //Execute the actions
        actions.pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ARROW_DOWN)
                .pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ENTER)
                .pause(500) // 500ms or 0.5s
                .perform();

        clickMainClientContact_menuitem();
    }

    public void clickMainClientContact_menuitem() {
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        //WebElement element = waiting.until(ExpectedConditions.visibilityOfElementLocated(txtOrganisation_menuitem));
        //element.click();
        //ldriver.findElement(txtOrganisation_menuitem);
        List<By> locators = new ArrayList<>();
        //locators.add(txtOrganisation_menuitem);
        //locators.add(By.cssSelector("div.someClass"));
        // add all your locators to the List<>

        for (By locator : locators) {
            List<WebElement> elements = ldriver.findElements(locator);

            if (elements.size() > 0) {
                elements.get(0).click();
                break;
            }
        }
    }

    public void clickBtnCreateOrgActivity() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnCreateOrgActivity).click();
    }

}
