import itmo.tg.Config;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneralTests extends SeleniumTests {

    @Test
    void titleTest() {
        var drivers = getDrivers();
        drivers.forEach(driver -> {
            driver.get(Config.URL);
            String title = driver.getTitle();
            assertEquals(Config.TITLE, title);
        });
    }

}
