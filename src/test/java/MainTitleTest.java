import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MainTitleTest extends TestDriver {

    @DisplayName("Sii.pl")
    @Tag("regresja")
    @Tag("Sii")
    @ParameterizedTest
    @ValueSource(strings = "Logowanie na koncie")
    public void siiTitleTest(String title) {
        getDriver().get("https://siiportal.sii.pl");
        assertThat("Title is not correct", getDriver().getTitle(), equalTo(title));
    }

    @DisplayName("Onet.pl")
    @Tag("regresja")
    @Tag("Onet")
    @ParameterizedTest
    @ValueSource(strings = "Onet – Jesteś na bieżąco")
    public void onetTitleTest(String title) {
        getDriver().get("https://www.onet.pl");
        assertThat("Title is not correct", getDriver().getTitle(), equalTo(title));
    }

    @DisplayName("Kotuszkowo.pl")
    @Tag("regresja")
    @Tag("Kotuszkowo")
    @ParameterizedTest
    @ValueSource(strings = "Kotuszkowo- blog o kotach")
    public void kotuszkowoTitleTest(String title) {
        getDriver().get("http://kotuszkowo.pl");
        assertThat("Title is not correct", getDriver().getTitle(), equalTo(title));
    }

    @DisplayName("Filmweb.pl")
    @Tag("regresja")
    @Tag("Filmweb")
    @ParameterizedTest
    @ValueSource(strings = "Filmweb - filmy takie jak Ty!")
    public void filmwebTitleTest(String title) {
        getDriver().get("https://www.filmweb.pl");
        assertThat("Title is not correct", getDriver().getTitle(), equalTo(title));
    }

    @DisplayName("Selenium.dev")
    @Tag("regresja")
    @Tag("Selenium")
    @ParameterizedTest
    @ValueSource(strings = "WebDriver | Selenium")
    public void seleniumTitleTest(String title) {
        getDriver().get("https://www.selenium.dev/documentation/webdriver/");
        assertThat("Title is not correct", getDriver().getTitle(), equalTo(title));
    }
}