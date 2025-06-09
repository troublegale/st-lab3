package itmo.tg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

public class Util {

    public static final String EMAIL = "wadobo1380@gotemv.com";
    public static final String USERNAME = "STA_lab3_username";
    public static final String PASSWORD = "STA_lab3_password";
    public static final String WRONG_PASSWORD = "STA_lab3_wrong_password";

    public static final String BASE_URL = "https://advego.com/";
    public static final String DASHBOARD_URL = "https://advego.com/dashboard/";
    public static final String PROFILE_URL = "https://advego.com/profile/" + USERNAME + "/";

    public static final String TITLE = "Адвего. Биржа маркетинга, фриланса и контента.";

    public static WebElement getElementByXpath(WebDriver driver, String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    public static void waitUntilPageLoads(WebDriver driver) {
        WebDriverWait waitDriver = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitDriver.until(webDriver -> Objects.equals(((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState"), "complete"));
    }

}
