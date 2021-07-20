package PageObjects.Sprint36;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_SearchBarFieldPlusContainerPage extends BasePage {

    @FindBy(xpath = "//span[@data-testid='record-check-all']")
    @CacheLookup
    public WebElement clickOutside;

    @FindBy(xpath = "//div[@class='MuiInputBase-root jss251 jss257 MuiInputBase-fullWidth Mui-focused MuiInputBase-adornedEnd']//button")
    @CacheLookup
    public WebElement btnX;

    public FE_SearchBarFieldPlusContainerPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
