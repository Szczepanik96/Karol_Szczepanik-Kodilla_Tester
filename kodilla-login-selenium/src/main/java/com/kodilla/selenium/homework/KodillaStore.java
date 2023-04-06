package com.kodilla.selenium.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaStore extends StoreAbstractPom {

    @FindBy(css = "input[name = search]")
    WebElement searchWindow;
    public KodillaStore(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public int search(String name){
        searchWindow.sendKeys(name);
        WebElement result = driver.findElement(By.cssSelector("div[class=element]"));
        return 0;
    }
}
