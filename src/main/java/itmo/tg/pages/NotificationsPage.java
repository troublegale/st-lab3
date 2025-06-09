package itmo.tg.pages;

import itmo.tg.Util;
import org.openqa.selenium.WebDriver;

public class NotificationsPage extends Page {

    public NotificationsPage(WebDriver driver) {
        super(driver);
    }

    public void searchWithFilters() {
        var periodChoice = Util.getElementByXpath(driver, "/html/body/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[1]/form/div/div/div[1]/div[1]/span[2]/span[1]");
        periodChoice.click();
        var today = Util.getElementByXpath(driver, "/html/body/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[1]/form/div/div/div[2]/div/div/div[2]/ul/li[1]");
        today.click();
        var types = Util.getElementByXpath(driver, "/html/body/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[1]/form/div/div/div[3]/div[7]/div[6]/span[1]/span/span");
        types.click();
        var checkbox = Util.getElementByXpath(driver, "//*[@id=\"ddcl-notice_types_select_6-i7\"]");
        checkbox.click();
        var searchButton = Util.getElementByXpath(driver, "/html/body/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[1]/form/div/div/div[4]/a");
        searchButton.click();
    }

}
