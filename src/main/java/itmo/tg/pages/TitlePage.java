package itmo.tg.pages;

import itmo.tg.Util;
import org.openqa.selenium.WebDriver;

public class TitlePage extends Page {

    public TitlePage(WebDriver driver) {
        super(driver);
    }

    public void logIn() {
        doLogIn(Util.PASSWORD);
    }

    public void logInIncorrect() {
        doLogIn(Util.WRONG_PASSWORD);
    }

    public void logOut() {
        var profileButton = Util.getElementByXpath(driver, "/html/body/div[3]/div[1]/div[1]/div/div/ul/li[1]/ul/li[1]/a[2]");
        profileButton.click();
        var logOutButton = Util.getElementByXpath(driver, "/html/body/div[3]/div[1]/div[1]/div/div/ul/li[1]/ul/li[1]/div/ul/li[4]/a");
        logOutButton.click();
    }

    private void doLogIn(String password) {
        var orderButton = Util.getElementByXpath(driver, "//*[@id=\"menu_9\"]");
        orderButton.click();
        var emailField = Util.getElementByXpath(driver, "//*[@id=\"login\"]");
        emailField.clear();
        emailField.sendKeys(Util.EMAIL);
        var saveButton = Util.getElementByXpath(driver, "//*[@id=\"order_add_submit\"]");
        saveButton.click();
        var passwordField = Util.getElementByXpath(driver, "//*[@id=\"pwd\"]");
        passwordField.clear();
        passwordField.sendKeys(password);
        saveButton.click();
    }

}
