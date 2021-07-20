package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class CandidateRemoveLinkClientContactPage {

    public WebDriver ldriver;

    public CandidateRemoveLinkClientContactPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root jss47']")
    @CacheLookup
    WebElement btnSearch;

    By txtSearch = By.xpath("//input[@class='MuiInputBase-input']");

    By lnkCandidate = By.className("ReactVirtualized__Grid__innerScrollContainer");

    By btnLinkThreeDots = By.xpath("//button[@data-testid='linkClientContactButton']");

    By btnLinkClientContact = By.xpath("//li[@tabindex='0']");

    By txtClientContact = By.id("client-lookup");

    By btnCreate = By.xpath("//button[@data-testid='linkClientSubmit']");




    //#########################################ACTIONS#########################################

    public void clickBtnSearch() {
        btnSearch.click();
    }

    public void setTxtSearch(String candidateName) {
        WebElement element = ldriver.findElement(txtSearch);
        //element.sendKeys(candidateName);
        element.sendKeys(candidateName.concat(String.valueOf(Keys.ENTER)));
        element.sendKeys(Keys.ARROW_DOWN);
        element.sendKeys(Keys.ENTER);

        //element.findElement(lnkCandidate).submit();


//        WebDriverWait wait = new WebDriverWait(ldriver, 5);
//        wait.until(ExpectedConditions.presenceOfElementLocated(txtSearch));
//        // Thread.sleep(3000);
//        List<WebElement> search = ldriver.findElements(lnkCandidate);

    }

//    public void clickLnkCandidate(){
//        lnkCandidate.click();
//    }

    public void clickLnkCandidate() {
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        WebElement element = waiting.until(ExpectedConditions.visibilityOfElementLocated(lnkCandidate));
        //element.click();
        ldriver.findElement(lnkCandidate);
        List<By> locators = new ArrayList<>();
        locators.add(lnkCandidate);
        //locators.add(By.cssSelector("div.someClass"));
        // add all your locators to the List<>

        for (By locator : locators)
        {
            List<WebElement> elements = ldriver.findElements(locator);

            if (elements.size() > 0)
            {
                elements.get(0).click();
                break;
            }
        }
    }

    public void clickLnkCandidate_Option(String text) {
        WebElement element = ldriver.findElement(By.xpath("//h6[contains(text(),'"+text+"')]"));
        element.click();
    }

    public void clickBtnThreeDots() {
        Actions actions = new Actions(ldriver);
        actions.pause(3000);
        ldriver.findElement(btnLinkThreeDots).click();
    }

    public void clickBtnLinkClientContact() {
        Actions actions = new Actions(ldriver);
        actions.pause(3000);
        ldriver.findElement(btnLinkClientContact).click();
    }

    public void setTxtClientContact(String clientContact) {
        Actions actions = new Actions(ldriver);
        actions.pause(3000);
        ldriver.findElement(txtClientContact).sendKeys(clientContact);
    }

    public void clickBtnCreateClientContact() {
        ldriver.findElement(btnCreate).click();
    }
}

