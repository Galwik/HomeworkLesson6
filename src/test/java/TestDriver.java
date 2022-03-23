import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDriver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeAll
    static void beforeAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void beforeEach() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void afterEach() {
        driver.quit();
    }
}