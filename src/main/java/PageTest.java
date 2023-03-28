import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.AfterClass;
public class PageTest {
    private static WebDriver driver;
    private static LoginPageTest loginPageTest;
    private static BasePage basePage;
    private static SearchTest searchTest;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webDriver.chrome.driver", "D://Automatinis testavimas//chromedriver.exe");
        driver = new ChromeDriver();
        loginPageTest = new LoginPageTest(driver);
        basePage = new BasePage(driver);
        searchTest = new SearchTest(driver);

        loginPageTest.goToBasePage();
        driver.manage().window().maximize();
        basePage.acceptCookies();
    }
    @Test
    public void loginTest(){
        loginPageTest.clickOnRegisterOrLogin();
        loginPageTest.clickOnLogin();
        loginPageTest.clickOnLoginByEmail();
    }
    @Test
    public void searchFieldTest(){
        searchTest.fillSearchField();
    }
    @AfterClass
    public static void tearDown(){
       driver.quit();
    }
}
