import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SearchTest extends BasePage{
    private static WebDriver driver;
    public SearchTest(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public void fillSearchField(){
        sendTextById("search_text", "suknele\n");
    }
}
