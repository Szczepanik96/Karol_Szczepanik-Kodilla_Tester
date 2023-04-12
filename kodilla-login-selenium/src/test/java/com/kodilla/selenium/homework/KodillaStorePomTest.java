package com.kodilla.selenium.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KodillaStorePomTest {

    KodillaStore kodillaStore;

    WebDriver driver;

    @BeforeEach
    public void setDriver() {
        kodillaStore = new KodillaStore(driver);
    }

    @Test
    public void testSearch_CheckPositiveValidation() {
        String[] name = {"NoteBook", "School", "Brand", "Business", "Gaming", "Powerful"};

        for(int i = 0; i < name.length; i++)
        {

            driver = new ChromeDriver();
            driver.navigate().to("https://kodilla.com/pl/test/store");

            WebDriverWait wait = new WebDriverWait(driver, 10);
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div>[class=\"draggable-container ui-selectable edited poptin-visible\"]")));

            WebElement advAccept =driver.findElement(By.cssSelector("div[tabindex=\"609\"]"));
            advAccept.click();

            WebElement searchType = driver.findElement(By.cssSelector("input[name = search]"));
            searchType.sendKeys(name[i]);

            List<WebElement> searchingResult = driver.findElements(By.cssSelector("div[class=element]"));
            int numberOfSearchingElement = searchingResult.size();
            driver.quit();

            int[] expectedResult = {2, 1, 1, 0, 1, 0};
            assertEquals(expectedResult[i], numberOfSearchingElement);

            System.out.println("Number of searched elements for word: "+ name[i] + " " + numberOfSearchingElement);
        }
    }

    @Test
    public void testOfCaseDependency(){
        String[] name = {"NoteBook", "School", "Brand", "Business", "Gaming", "Powerful"};

        for(String keyWord: name)
        {
            driver = new ChromeDriver();
            driver.navigate().to("https://kodilla.com/pl/test/store");

            WebDriverWait wait = new WebDriverWait(driver, 10);
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div>[class=\"draggable-container ui-selectable edited poptin-visible\"]")));

            WebElement advAccept =driver.findElement(By.cssSelector("div[tabindex=\"609\"]"));
            advAccept.click();

            WebElement searchType = driver.findElement(By.cssSelector("input[name = search]"));
            searchType.sendKeys(keyWord);

            List<WebElement> searchingResult = driver.findElements(By.cssSelector("div[class=element]"));
            int numberOfSearchingElement = searchingResult.size();

            driver.quit();

            driver = new ChromeDriver();
            driver.navigate().to("https://kodilla.com/pl/test/store");

            wait = new WebDriverWait(driver, 10);
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div>[class=\"draggable-container ui-selectable edited poptin-visible\"]")));

            advAccept =driver.findElement(By.cssSelector("div[tabindex=\"609\"]"));
            advAccept.click();

            searchType = driver.findElement(By.cssSelector("input[name = search]"));
            searchType.sendKeys(keyWord.toLowerCase());

            searchingResult = driver.findElements(By.cssSelector("div[class=element]"));
            int numberOfSearchingElementLowerCase = searchingResult.size();
            System.out.println("Number of searched elements for word with lower case: "+ keyWord.toLowerCase() + " " + numberOfSearchingElementLowerCase);

            driver.quit();

            assertEquals(numberOfSearchingElement,numberOfSearchingElementLowerCase);
        }
    }
}