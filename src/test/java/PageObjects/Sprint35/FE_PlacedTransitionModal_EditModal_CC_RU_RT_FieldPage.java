package PageObjects.Sprint35;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FE_PlacedTransitionModal_EditModal_CC_RU_RT_FieldPage extends BasePage {

    @FindBy(xpath = "//li[contains(text(), 'Product')]")
    @CacheLookup
    public WebElement txtResponsibleTeam_item;

    public FE_PlacedTransitionModal_EditModal_CC_RU_RT_FieldPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
