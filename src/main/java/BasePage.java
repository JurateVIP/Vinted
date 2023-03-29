import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    private final By cookies = By.id("onetrust-accept-btn-handler");
    private final WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void acceptCookies(){
        try{
            WebElement cookie = wait.until(ExpectedConditions.elementToBeClickable(cookies));
            cookie.click();
        }
        catch(Exception e){
            System.out.println("Cookies was not found." + e.getMessage());
        }
    }
    public void clickByXpath(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    public void clickById(String id){
        driver.findElement(By.id(id)).click();
    }
    public void sendTextByXpath(String xpath, String text){
        driver.findElement(By.xpath(xpath)).sendKeys(text);
    }
    public void sendTextById(String id, String text){
        driver.findElement(By.id(id)).sendKeys(text);
    }
    public void screenShot() throws IOException {
        File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Path destinationPath = Paths.get("screenshot1.png");
        Files.copy(screenShotFile.toPath(), destinationPath);
    }
}
