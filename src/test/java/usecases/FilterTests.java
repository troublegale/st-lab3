package usecases;

import common.SeleniumTests;
import itmo.tg.Util;
import itmo.tg.pages.NotificationsPage;
import itmo.tg.pages.TitlePage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilterTests extends SeleniumTests {

    @Test
    public void testFilter() {
        var drivers = getDrivers();
        drivers.forEach(driver -> {
            var titlePage = new TitlePage(driver);
            driver.get(Util.BASE_URL);
            titlePage.logIn();
            titlePage.goToNotifications();
            var notificationsPage = new NotificationsPage(driver);
            notificationsPage.searchWithFilters();
            var notification = Util.getElementByXpath(driver, "/html/body/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]");
            assertTrue(notification.getText().contains("Произошёл вход в аккаунт."));
        });
    }

}
