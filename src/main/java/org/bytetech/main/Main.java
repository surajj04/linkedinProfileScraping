package org.bytetech.main;

import org.bytetech.config.Config;
import org.bytetech.model.Profile;
import org.bytetech.util.Login;
import org.bytetech.util.ProfileUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Config config = new Config();
        WebDriver driver = config.getDriver();

        Login.login(("nagog90902@bawsny.com"), "nagog@1234 ", driver);

        ProfileUtil.getProfile("https://www.linkedin.com/in/kunal-kushwaha/", driver);

//        driver.navigate().to("https://www.saucedemo.com/v1/");
//
//        driver.findElement(By.xpath("//div[2]/div[1]/div/div/form/input[1]")).sendKeys("standard_user");
//        driver.findElement(By.xpath("//div[2]/div[1]/div/div/form/input[2]")).sendKeys("secret_sauce");
//        driver.findElement(By.xpath("//div[2]/div[1]/div/div/form/input[3]")).click();
//
//        List<WebElement> eles = driver.findElements(By.xpath("//div/div[2]/div[2]/div/div[2]/div/div"));
//
//        System.out.println(eles.size());
//
//        for (WebElement ele : eles) {
//            System.out.println(ele.getText());
//        }


    }
}
