package org.bytetech.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    public static void login(String email, String password, WebDriver driver) {
        driver.navigate().to("https://www.linkedin.com/login");

        driver.findElement(By.xpath("//main/div[2]/div[1]/form/div[1]/input")).sendKeys(email);
        driver.findElement(By.xpath("//main/div[2]/div[1]/form/div[2]/input")).sendKeys(password);
        driver.findElement(By.cssSelector("#organic-div > form")).submit();

        driver.manage().window().maximize();
    }
}
