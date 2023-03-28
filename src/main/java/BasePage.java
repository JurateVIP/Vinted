import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }
    public void acceptCookies(){
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
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
}
