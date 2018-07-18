package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {

    private static final String SEARCHFIELD_ID = "lst-ib";

    public static void main(String[] args) {

        WebDriver webdriver = WebDriverConfig.getWebdriver(WebDriverConfig.FIREFOX);
        webdriver.get("https://www.google.pl/");

        WebElement searchField = webdriver.findElement(By.id(SEARCHFIELD_ID));
        searchField.sendKeys("Kodilla");
        searchField.submit();
    }
}
