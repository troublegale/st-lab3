package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class SeleniumTests {

    private final List<WebDriver> drivers = new ArrayList<>(2);

    public List<WebDriver> getDrivers() {
        return drivers;
    }

    @BeforeAll
    static void setupDrivers() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeEach
    void setup() {
        drivers.add(0, new ChromeDriver());
        drivers.add(1, new FirefoxDriver());
    }

    @AfterEach
    void tearDown() {
        drivers.forEach(WebDriver::quit);
    }

}
