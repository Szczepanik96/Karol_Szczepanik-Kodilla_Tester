package com.kodilla.selenium.homework;

import org.openqa.selenium.WebDriver;

public abstract class StoreAbstractPom {
    protected WebDriver driver;

    public StoreAbstractPom(WebDriver driver){
        this.driver = driver;
    }
}
