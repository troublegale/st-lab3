package common;

import itmo.tg.Util;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneralTests extends SeleniumTests {

    @Test
    void titleTest() {
        var drivers = getDrivers();
        drivers.forEach(driver -> {
            driver.get(Util.BASE_URL);
            String title = driver.getTitle();
            assertEquals(Util.TITLE, title);
        });
    }

}
