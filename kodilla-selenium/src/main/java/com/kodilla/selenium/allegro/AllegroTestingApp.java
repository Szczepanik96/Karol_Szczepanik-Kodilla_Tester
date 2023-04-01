package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Google Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.pl/");

        WebElement typeCombo = driver.findElement(By.xpath("//*[@id=\"gh-cat-td\"]/div/select"));
        Select typeSelect = new Select(typeCombo);
        typeSelect.selectByIndex(9);

        WebElement inputField = driver.findElement(By.xpath("//*[@id=\"gh-ac-box2\"]/input"));
        inputField.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"gh-f\"]/table/tbody/tr/td[3]/input"));
        searchButton.submit();
    }
}