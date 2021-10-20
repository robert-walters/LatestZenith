package PageObjects.Sprint40;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_JobRecord_ReplaceLastActivityDateWithLastContactedDatePage extends BasePage {

    @FindBy(xpath = "//p[contains(text(), 'Lunga(Automation do not delete)')]")
    public WebElement lnkJobItem;

    @FindBy(xpath = "")
    public WebElement lnkText;

    public FE_JobRecord_ReplaceLastActivityDateWithLastContactedDatePage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
