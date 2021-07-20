package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class create_CandidateRecordPage extends BasePage {

    public WebElement candidateFullName(String fullName){
        By locator = By.xpath("//span[@aria-label='"+fullName+"']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return webDriver.findElement(By.xpath("//span[@aria-label='"+fullName+"']"));
    }

    public create_CandidateRecordPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
