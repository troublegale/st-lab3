package usecases;

import common.SeleniumTests;
import itmo.tg.Util;
import itmo.tg.pages.TitlePage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTests extends SeleniumTests {

    @Test
    public void orderTest() {
        var drivers = getDrivers();
        drivers.forEach(driver -> {
            var titlePage = new TitlePage(driver);
            driver.get(Util.BASE_URL);
            titlePage.order();
            var error = Util.getElementByXpath(driver, "//*[contains(@class, 'alert alert-danger status_bad')]");
            assertTrue(error.isDisplayed());
        });
    }

}
