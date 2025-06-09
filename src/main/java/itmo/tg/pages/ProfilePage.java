package itmo.tg.pages;

import itmo.tg.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProfilePage extends Page {

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public void editProfile() {
        var editButton = Util.getElementByXpath(driver, "/html/body/div[3]/div[2]/div[2]/div/div[2]/div/div/div/div[9]/a");
        editButton.click();
        var genderChoice = Util.getElementByXpath(driver, "//*[@id=\"user_sex\"]");
        var selectGender = new Select(genderChoice);
        selectGender.selectByVisibleText("Мужской");
        var saveButton = Util.getElementByXpath(driver, "//*[@id=\"user_form_submit\"]");
        saveButton.click();
    }

    public void editNotifications() {
        var editButton = Util.getElementByXpath(driver, "/html/body/div[3]/div[2]/div[2]/div/div[2]/div/div/div/div[9]/a");
        editButton.click();
        var notificationsButton = Util.getElementByXpath(driver, "/html/body/div[3]/div[2]/div[2]/div/div[2]/div[1]/a[6]");
        notificationsButton.click();
        var moneyField = Util.getElementByXpath(driver, "//*[@id=\"user_money_notify\"]");
        moneyField.clear();
        moneyField.sendKeys("300");
        var saveButton = Util.getElementByXpath(driver, "//*[@id=\"user_form_submit\"]");
        saveButton.click();
    }

}
