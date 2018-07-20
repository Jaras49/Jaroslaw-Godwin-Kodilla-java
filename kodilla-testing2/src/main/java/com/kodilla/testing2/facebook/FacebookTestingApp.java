package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    private static final String FACEBOOK_URL = "https://www.facebook.com";
    private static final String XPATH_BIRTHDATE = "//span[contains(@class, \"_5k_4\")]/span/";
    private static final String SELECT_1 = "select[1]";
    private static final String SELECT_2 = "select[2]";
    private static final String SELECT_3 = "select[3]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getWebdriver(WebDriverConfig.CHROME);
        driver.get(FACEBOOK_URL);

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_BIRTHDATE + SELECT_1));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByValue("1");

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_BIRTHDATE + SELECT_2));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(8);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_BIRTHDATE + SELECT_3));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByValue("1992");
    }
}
