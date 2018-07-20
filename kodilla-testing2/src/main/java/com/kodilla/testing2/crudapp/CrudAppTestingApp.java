package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CrudAppTestingApp {

    private static final String TASK_APP_URL = "https://jaras49.github.io/";
    private static final String XPATH_INPUT = "/html/body/main/section/form/fieldset/input";
    private static final String XPATH_TEXTAREA = "/html/body/main/section/form/fieldset[2]/textarea";
    private static final String XPATH_WAIT_FOR = "//select[1]";
    private static final String XPATH_SELECT = "//div[contains(@class, \"tasks-container\")]/form/div/fieldset/select[1]";

    public static void main(String[] args) {

        WebDriver webdriver = WebDriverConfig.getWebdriver(WebDriverConfig.CHROME);
        webdriver.get(TASK_APP_URL);

        WebElement searchField = webdriver.findElement(By.xpath(XPATH_INPUT));
        searchField.sendKeys("New robotic task");

        WebElement textArea = webdriver.findElement(By.xpath(XPATH_TEXTAREA));
        textArea.sendKeys("The robotic content");

        while(!webdriver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectCombo = webdriver.findElement(By.xpath(XPATH_SELECT));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(1);
    }
}
