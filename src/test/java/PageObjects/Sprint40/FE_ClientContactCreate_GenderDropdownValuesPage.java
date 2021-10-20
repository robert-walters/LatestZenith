package PageObjects.Sprint40;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_ClientContactCreate_GenderDropdownValuesPage extends BasePage {

    @FindBy(id = "mui-component-select-gender")
    @CacheLookup
    public WebElement drpBtnGender;

    public FE_ClientContactCreate_GenderDropdownValuesPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
