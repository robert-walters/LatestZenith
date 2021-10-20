package PageObjects.Sprint43;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_Pagination_ImplementPaginationForClientContactLibraryPage extends BasePage {

    @FindBy(xpath = "//a[@data-testid='allClientsLink']")
    @CacheLookup
    public WebElement clientContacts;

    @FindBy(xpath = "/html/body/div/div/div[1]/div[4]/div/div/div[3]/button[2]")
    @CacheLookup
    public WebElement btnNext;

    public FE_Pagination_ImplementPaginationForClientContactLibraryPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
