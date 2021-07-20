package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class glob_LoginPage extends BasePage {
    @FindBy(xpath = "//input[@id='loginId']")
    public WebElement emailTextField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(xpath = "//button[@class='blue button']")
    public WebElement submitButton;

    public glob_LoginPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }

    public void OpenPage() throws Exception {

        if (System.getProperty("env").equals("dev")) {
            webDriver.get("https://dev.digitalzenith.io/");
            System.out.println("Opening - https://dev.digitalzenith.io/");
        }else if (System.getProperty("env").equals("sit")) {
            webDriver.get("https://sit.digitalzenith.io/");
            System.out.println("Opening - https://sit.digitalzenith.io/");
        }


    }
}
