package usecases;

import common.SeleniumTests;
import itmo.tg.Util;
import itmo.tg.pages.ProfilePage;
import itmo.tg.pages.TitlePage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProfileTests extends SeleniumTests {

    @Test
    public void testProfileEdit() {
        var drivers = getDrivers();
        drivers.forEach(driver -> {
            var titlePage = new TitlePage(driver);
            driver.get(Util.BASE_URL);
            titlePage.logIn();
            titlePage.goToProfile();
            var profilePage = new ProfilePage(driver);
            profilePage.editProfile();
            var error = Util.getElementByXpath(driver, "/html/body/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[5]/div/div/div/div");
            assertTrue(error.isDisplayed());
        });
    }

    @Test
    public void testNotificationsEdit() {
        var drivers = getDrivers();
        drivers.forEach(driver -> {
            var titlePage = new TitlePage(driver);
            driver.get(Util.BASE_URL);
            titlePage.logIn();
            titlePage.goToProfile();
            var profilePage = new ProfilePage(driver);
            profilePage.editNotifications();
            var success = Util.getElementByXpath(driver, "/html/body/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[5]/div/div/div/div");
            assertTrue(success.isDisplayed());
        });
    }

}
