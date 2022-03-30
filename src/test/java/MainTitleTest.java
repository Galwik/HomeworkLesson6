import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MainTitleTest extends TestDriver {
    private static Logger logger = LoggerFactory.getLogger("MainTitleTest.class");

    @Tag("regresja")
    @ParameterizedTest
    @CsvFileSource(resources = "/urlAndTitle.csv")
    public void allTitleTest(String url, String title) {
        driver.get(url);
        logger.info("<<<<<App url: " + url);
        logger.info("<<<<<App title: " + title);
        assertThat("Title is not correct", driver.getTitle(), equalTo(title));
    }
}