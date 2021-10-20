package PageObjects.Sprint40;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DownloadingDocument_CandidatePage extends BasePage {

    @FindBy(xpath = "//span[@class='MuiTypography-root jss2349 jss2350 MuiTypography-subtitle1 MuiTypography-colorTextPrimary MuiTypography-noWrap']//button[@data-testid='download_button']")
    @CacheLookup
    public WebElement btnDownload;

    public DownloadingDocument_CandidatePage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
