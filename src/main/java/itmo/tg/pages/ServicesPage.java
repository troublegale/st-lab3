package itmo.tg.pages;

import itmo.tg.Util;
import org.openqa.selenium.WebDriver;

public class ServicesPage extends Page {

    public ServicesPage(WebDriver driver) {
        super(driver);
    }

    public void textLength(String text) {
        var textEntriesLink = Util.getElementByXpath(driver, "/html/body/div[3]/div[2]/div[2]/div/div[2]/div/div/div[4]/div/ul/li[5]/a");
        textEntriesLink.click();
        var textField = Util.getElementByXpath(driver, "//*[@id=\"textcheck\"]");
        textField.clear();
        textField.sendKeys(text);
    }

    public void orthography(String text) {
        var orthographyLink = Util.getElementByXpath(driver, "/html/body/div[3]/div[2]/div[2]/div/div[2]/div/div/div[4]/div/ul/li[3]/a");
        orthographyLink.click();
        var textField = Util.getElementByXpath(driver, "//*[@id=\"job_text_spell\"]");
        textField.clear();
        textField.sendKeys(text);
        var button = Util.getElementByXpath(driver, "/html/body/div[3]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/a[1]");
        button.click();
    }

}
