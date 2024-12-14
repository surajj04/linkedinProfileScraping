package org.bytetech.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {

    private WebDriver driver;

    public Config() {
        driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
