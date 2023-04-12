package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.Paths;


public class OcularExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "d:\\karol\\projektyKodilla\\kodilla-course\\kodilla-login-selenium\\chromedriver.exe");        // [1]
        WebDriver webDriver = new ChromeDriver();


        Ocular.config()
                .resultPath(Paths.get("d:\\karol\\ocular\\results"))
                .snapshotPath(Paths.get("d:\\karol\\ocular\\snapshots"))
                .globalSimilarity(95)
                .saveSnapshot(true);


        WebDriverWait wait = new WebDriverWait(webDriver, 10);
//        wait.until(ExpectedConditions.visibilityOf(By.cssSelector("div>[class=\"sc-gueYoa kcKQPW\"]")));


        WorldTimePage page = new WorldTimePage(webDriver);
        page.open();
        page.closeAd();
        page.compare();
        page.close();
    }
}
