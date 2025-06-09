package itmo.tg.pages;

import itmo.tg.Util;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends Page {

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public void logOut() {
        var profileButton = Util.getElementByXpath(driver, "/html/body/div[3]/div[1]/div[1]/div/div/ul/li[1]/ul/li[1]/a[2]");
        profileButton.click();
        var logOutButton = Util.getElementByXpath(driver, "/html/body/div[3]/div[1]/div[1]/div/div/ul/li[1]/ul/li[1]/div/ul/li[4]/a");
        logOutButton.click();
    }

}
