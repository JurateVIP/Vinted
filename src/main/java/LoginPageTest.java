import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest extends BasePage{
    private static WebDriver driver;

    public LoginPageTest(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public void goToBasePage(){
        driver.get("https://www.vinted.lt/");
    }
    public void clickOnRegisterOrLogin(){
        clickByXpath("//a[@data-testid='header--login-button']");
    }
    public void clickOnLogin(){
        clickByXpath("(//span[@class='u-cursor-pointer'])[2]");
    }
    public void clickOnLoginByEmail(){
        clickByXpath("(//span[@class='u-cursor-pointer'])[1]");
    }

}
