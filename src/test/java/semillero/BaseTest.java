package semillero;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static WebDriver driver;

    public BaseTest() {
        System.setProperty("webdriver.chrome.driver", "./src/test/java/semillero/chrome/chromedriver");
        driver = new ChromeDriver();
    }
}