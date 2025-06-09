package usecases;

import common.SeleniumTests;
import itmo.tg.Util;
import itmo.tg.pages.ServicesPage;
import itmo.tg.pages.TitlePage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceTests extends SeleniumTests {

    @Test
    void textTextLength() {
        var drivers = getDrivers();
        drivers.forEach(driver -> {
            var titlePage = new TitlePage(driver);
            driver.get(Util.BASE_URL);
            titlePage.goToServices();
            var servicesPage = new ServicesPage(driver);
            servicesPage.textLength("Классическая монета");
            var count = Util.getElementByXpath(driver, "//*[@id=\"symbolscount\"]");
            assertEquals("19", count.getText());
        });
    }

    @Test
    void testOrthography() {
        var drivers = getDrivers();
        drivers.forEach(driver -> {
            var titlePage = new TitlePage(driver);
            driver.get(Util.BASE_URL);
            titlePage.goToServices();
            var servicesPage = new ServicesPage(driver);
            servicesPage.orthography("Почему мох ростет на северной старане");
            var mistakes = Util.getElementByXpath(driver, "/html/body/div[3]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[9]/td[2]");
            assertEquals("2", mistakes.getText());
        });
    }

}
