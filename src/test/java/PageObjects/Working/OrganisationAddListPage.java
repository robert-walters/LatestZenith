package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class OrganisationAddListPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public OrganisationAddListPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver, 10);
    }

    //By lnkOrganisationList = By.xpath("//a[@data-testid='organisationsListsLink']");
    @FindBy(xpath = "//a[@data-testid='organisationsListsLink']")
    @CacheLookup
    public WebElement lnkOrganisationList;

    By btnAddList = By.xpath("//span[contains(text(), 'Add List')]");

    By txtListName = By.name("name");

    By btnCREATE = By.xpath("//button[@data-testid='create_organisation_listSubmit']");

    //##################################################ACTIONS##################################################

    public void clickLnkOrganisationList() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement element = ldriver.findElement(By.xpath("//a[@data-testid='organisationsListsLink']"));
        JavascriptExecutor executor = (JavascriptExecutor)ldriver;
        executor.executeScript("arguments[0].click();", element);

    }

    public void clickBtnAddList() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnAddList).click();
    }

    public void getTxtListName(String listName) throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtListName).clear();
        ldriver.findElement(txtListName).sendKeys(listName);
    }

    public void clickBtnCREATE() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnCREATE).click();
    }
}
