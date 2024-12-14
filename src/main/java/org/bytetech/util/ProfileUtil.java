package org.bytetech.util;

import org.bytetech.model.Profile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProfileUtil {
    public static Profile getProfile(String url, WebDriver driver) {

        Profile profile = new Profile();

        driver.navigate().to(url);

        profile.setName(driver.findElement(By.xpath("//section[1]/div[2]/div[2]/div[1]/div[1]/span/a/h1")).getText());
        profile.setHeadline(driver.findElement(By.xpath("//div/main/section[1]/div[2]/div[2]/div[1]/div[2]")).getText());
        profile.setLocation(driver.findElement(By.xpath("//main/section[1]/div[2]/div[2]/div[2]/span[1]")).getText());
        profile.setAbout(driver.findElement(By.xpath("//main/section[2]/div[3]/div/div/div/span[1]")).getText());


        return new Profile();
    }
}
