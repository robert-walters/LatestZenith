package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrganisationRecordLocationEditLocationPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public OrganisationRecordLocationEditLocationPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By btnLocationTab= By.id("scrollable-auto-tab-2");

    By btnThreeDots= By.xpath("//div[@data-testid='card-header']//button");

    By btnEditLocation = By.xpath("//p[contains(text(), 'Edit Location')]");

    By btnOK = By.xpath("//span[contains(text(), 'ok')]");

    By txtAddressLineOne = By.name("address_line_1");

    By txtProvince = By.name("province");

    By txtPostCode = By.name("postcode");

    By rdBtnMakeThisPrimaryLocation = By.name("is_primary");

    By btnSave = By.xpath("//button[@data-testid='editLocationSubmit']");


    //###########################################ACTIONS###################################################

    public void clickBtnLocationTab() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnLocationTab).click();
    }

    public void clickBtnThreeDots() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnThreeDots).click();
    }

    public void clickBtnEditLocation() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnEditLocation).click();
    }

    public void clickBtnOK() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnOK).click();
    }

    public void setTxtAddressLineOne(String province) throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtAddressLineOne).sendKeys(province);
    }

    public void setTxtProvinceName(String province) throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtProvince).sendKeys(province);
    }

    public void setTxtPostCodeNumber(String postCodeNumber) throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtPostCode).sendKeys(postCodeNumber);
    }

    public void clickRdBtnMakeThisPrimaryLocation() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(rdBtnMakeThisPrimaryLocation).click();
    }

    public void clickBtnSave() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnSave).click();
    }


}
