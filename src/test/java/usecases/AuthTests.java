package usecases;

import common.SeleniumTests;
import itmo.tg.Util;
import itmo.tg.pages.DashboardPage;
import itmo.tg.pages.TitlePage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AuthTests extends SeleniumTests {

    @Test
    void logInTest() {
        var drivers = getDrivers();
        drivers.forEach(driver -> {
            var titlePage = new TitlePage(driver);
            driver.get(Util.BASE_URL);
            titlePage.logIn();
            var profileButton = Util.getElementByXpath(driver, "/html/body/div[3]/div[1]/div[1]/div/div/ul/li[1]/ul/li[1]/a[2]");
            assertTrue(profileButton.getText().contains(Util.USERNAME));
        });
    }

    @Test
    void logInIncorrectTest() {
        var drivers = getDrivers();
        drivers.forEach(driver -> {
            var titlePage = new TitlePage(driver);
            driver.get(Util.BASE_URL);
            titlePage.logInIncorrect();
            var error = Util.getElementByXpath(driver, "//*[@id=\"wrong_login_password\"]");
            assertEquals("Неправильное сочетание логина или пароля", error.getText());
        });
    }

    @Test
    void logOutTest() {
        var drivers = getDrivers();
        drivers.forEach(driver -> {
            var titlePage = new TitlePage(driver);
            var dashboardPage = new DashboardPage(driver);
            driver.get(Util.BASE_URL);
            titlePage.logIn();
            dashboardPage.logOut();
            var logInButton = Util.getElementByXpath(driver, "/html/body/div[4]/div[1]/div[1]/div/div[1]/ul/li[1]/a");
            assertTrue(logInButton.isDisplayed());
        });
    }

}
