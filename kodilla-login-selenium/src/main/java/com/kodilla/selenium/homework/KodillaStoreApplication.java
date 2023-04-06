package com.kodilla.selenium.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaStoreApplication {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "d:\\karol\\projektyKodilla\\kodilla-course\\kodilla-login-selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        KodillaStore storePom = new KodillaStore(driver);
        storePom.search("Notebook");
    }
}