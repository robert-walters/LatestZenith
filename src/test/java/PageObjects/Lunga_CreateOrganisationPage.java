package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lunga_CreateOrganisationPage extends BasePage{

    @FindBy(xpath = "//input[@data-testid='name']")
    public WebElement OrganisationNameTextField;

    @FindBy(xpath = "//*[@data-testid='locationName']")
    public WebElement LocationNameTextField;

    @FindBy(xpath = "//*[@data-testid='Country-label']")
    public WebElement CountryNameTextField;

    @FindBy(xpath = "//*[@data-value='AFG']")
    public WebElement CountryMenuItem;

    @FindBy(xpath = "//*[@data-testid='locationCity']")
    public WebElement CityNameTextField;

    @FindBy(xpath = "//button[@data-testid='testIdSubmit']")
    public WebElement btnCreate;

    public Lunga_CreateOrganisationPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
