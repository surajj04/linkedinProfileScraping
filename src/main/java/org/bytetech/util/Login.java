package org.bytetech.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    public static void login(String email, String password, WebDriver driver) {
        driver.navigate().to("https://www.linkedin.com/login");

        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[4]/button")).click();

        driver.manage().window().maximize();
    }
}
