package PageObjects.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginNewPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public LoginNewPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver, 10);
        ldriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    By txtUsername = By.name("loginId");

    By txtPassword = By.name("password");

    By btnSignIn = By.xpath("//button[@class='blue button']");

    //###############################################ACTIONS#############################################1479


    public void setTxtUsername(String username) throws Exception {
        Thread.sleep(3000);
        ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ldriver.findElement(txtUsername).sendKeys(username);
    }

    public void setTxtPassword(String password) throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtPassword).sendKeys(password);
    }

    public void clickBtnSignIn() throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnSignIn).click();
    }
}
