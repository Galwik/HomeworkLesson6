import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MainTitleTest extends TestDriver {
    private static Logger logger = LoggerFactory.getLogger("MainTitleTest.class");

    @DisplayName("Sii.pl")
    @Tag("regresja")
    @Tag("Sii")
    @ParameterizedTest
    @CsvSource("https://siiportal.sii.pl, Logowanie na koncie")
    public void siiTitleTest(String url, String title) {
        driver.get(url);
        logger.info("<<<<<App url: " + url);
        logger.info("<<<<<App title: " + title);
        assertThat("Title is not correct", driver.getTitle(), equalTo(title));
    }

    @DisplayName("Onet.pl")
    @Tag("regresja")
    @Tag("Onet")
    @ParameterizedTest
    @CsvSource("https://www.onet.pl, Onet – Jesteś na bieżąco")
    public void onetTitleTest(String url, String title) {
        driver.get(url);
        assertThat("Title is not correct", driver.getTitle(), equalTo(title));
    }

    @DisplayName("Kotuszkowo.pl")
    @Tag("regresja")
    @Tag("Kotuszkowo")
    @ParameterizedTest
    @CsvSource("http://kotuszkowo.pl, Kotuszkowo- blog o kotach")
    public void kotuszkowoTitleTest(String url, String title) {
        driver.get(url);
        assertThat("Title is not correct", driver.getTitle(), equalTo(title));
    }

    @DisplayName("Filmweb.pl")
    @Tag("regresja")
    @Tag("Filmweb")
    @ParameterizedTest
    @CsvSource("https://www.filmweb.pl, Filmweb - filmy takie jak Ty!")
    public void filmwebTitleTest(String url, String title) {
        driver.get(url);
        assertThat("Title is not correct", driver.getTitle(), equalTo(title));
    }

    @DisplayName("Selenium.dev")
    @Tag("regresja")
    @Tag("Selenium")
    @ParameterizedTest
    @CsvSource("https://www.selenium.dev/documentation/webdriver/, WebDriver | Selenium")
    public void seleniumTitleTest(String url, String title) {
        driver.get(url);
        assertThat("Title is not correct", driver.getTitle(), equalTo(title));
    }
}