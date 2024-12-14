package org.bytetech.util;

import org.bytetech.exceptions.ElementNotFound;
import org.bytetech.model.Profile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ProfileUtil {
    public static Profile getProfile(String url, WebDriver driver) {

        Profile profile = new Profile();

        try {
            Thread.sleep(2000);
            driver.navigate().to(url);
            Thread.sleep(2000);
            profile.setName(driver.findElement(By.xpath("//section[1]/div[2]/div[2]/div[1]/div[1]/span/a/h1")).getText());
            profile.setHeadline(driver.findElement(By.xpath("//div/main/section[1]/div[2]/div[2]/div[1]/div[2]")).getText());
            profile.setLocation(driver.findElement(By.xpath("//main/section[1]/div[2]/div[2]/div[2]/span[1]")).getText());
            profile.setAbout(driver.findElement(By.xpath("//main/section[2]/div[3]/div/div/div/span[1]")).getText());
            Thread.sleep(6000);
            profile.setExperience(getExperience(driver));
            Thread.sleep(6000);
            profile.setEducation(getEducation(driver));
            Thread.sleep(6000);
            profile.setCertification(getCertification(driver));
            Thread.sleep(6000);
            profile.setSkills(getSkill(driver));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return profile;
    }


    public static List<String> getExperience(WebDriver driver) {
        List<String> list = new ArrayList<>();

        try {
            driver.findElement(By.xpath("//a[@id='navigation-index-see-all-experiences']")).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            List<WebElement> webEle = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='application-outlet']/div[@class='authentication-outlet']/div[@id='profile-content']/div[@class='body']/div[2]/div[1]/div[1]/main[1]/section[1]/div[2]/div[1]/div[1]/ul[1]/li")));

            if (!webEle.isEmpty()) {
                for (WebElement ele : webEle) {
                    list.add(ele.getText());
                }
            }
            driver.navigate().back();
        } catch (ElementNotFound elementNotFound) {
            List<WebElement> webEle = driver.findElements(By.xpath("//main/section[5]/div[4]/ul/li"));

            if (!webEle.isEmpty()) {
                for (WebElement ele : webEle) {
                    list.add(ele.getText());
                }
            }
        }
        return list;
    }

    public static List<String> getEducation(WebDriver driver) {
        List<String> list = new ArrayList<>();

        List<WebElement> edu = driver.findElements(By.xpath("//main/section[6]/div[3]/ul/li"));

        for (WebElement ele : edu) {
            list.add(ele.getText());
        }
        return list;
    }

    public static List<String> getSkill(WebDriver driver) {
        List<String> list = new ArrayList<>();

        try {
            driver.findElement(By.xpath("//main/section[10]/div[3]/div/div/div/a")).click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            List<WebElement> skillEle = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//main/section/div[2]/div[2]/div/div/div[1]/ul/li/div/div/div[2]/div[1]/a/div/div/div/div/span[1]")));
            if (!skillEle.isEmpty()) {
                for (WebElement ele : skillEle) {
                    list.add(ele.getText());
                }
            }
            driver.navigate().back();
        } catch (ElementNotFound elementNotFound) {
            System.out.println("Element Not Found!!!");
        }
        return list;
    }

    public static List<String> getCertification(WebDriver driver) {
        List<String> list = new ArrayList<>();

        try {
            driver.findElement(By.xpath("//main/section[7]/div[3]/div/div/div/a")).click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            List<WebElement> certificates = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//main/section/div[2]/div/div[1]/ul/li")));

            for (WebElement ele : certificates) {
                list.add(ele.getText());
            }
            driver.navigate().back();
        } catch (ElementNotFound elementNotFound) {
            List<WebElement> certificates = driver.findElements(By.xpath("//main/section[7]/div[3]/ul/li"));

            for (WebElement ele : certificates) {
                list.add(ele.getText());
            }
        }
        return list;
    }

    public static String filter(String text) {
        if (text.contains("\"")) {
            text.replace("\"", "");
        }
        return text;
    }

}
