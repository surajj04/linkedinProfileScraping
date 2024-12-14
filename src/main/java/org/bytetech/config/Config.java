package org.bytetech.config;

import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Data
public class Config {

    private final WebDriver driver;

    public Config() {
        driver = new ChromeDriver();
    }
}
