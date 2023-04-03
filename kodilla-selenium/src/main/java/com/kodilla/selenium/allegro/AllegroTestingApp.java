package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Google Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.pl/");

        WebElement typeCombo = driver.findElement(By.cssSelector("select[id= 'gh-cat' ]"));
        Select typeSelect = new Select(typeCombo);
        typeSelect.selectByIndex(9);

        WebElement inputField = driver.findElement(By.cssSelector("input[id=\"gh-ac\"]"));
        inputField.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.cssSelector("input[id=\"gh-btn\"]"));
        searchButton.submit();

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div > ul[class*=srp-results]")));

        List<WebElement> elements = driver.findElements(By.cssSelector("a > div[class*=s-item__title]"));
        for (WebElement element : elements) {
            System.out.println(element.getText());
        }
    }
}