package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {

    private static final String LAPTOP = "LAPTOP";
    private static final String EBAY_URL = "https://www.ebay.com/";
    private static final String SEARCH_FIELD_NAME = "_nkw";

    public static void main(String[] args) {

        WebDriver webdriver = WebDriverConfig.getWebdriver(WebDriverConfig.FIREFOX);
        webdriver.get(EBAY_URL);
        WebElement searchField = webdriver.findElement(By.name(SEARCH_FIELD_NAME));

        searchField.sendKeys(LAPTOP);
        searchField.submit();
    }
}
