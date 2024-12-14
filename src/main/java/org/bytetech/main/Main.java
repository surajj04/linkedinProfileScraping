package org.bytetech.main;

import org.bytetech.config.Config;
import org.bytetech.model.Profile;
import org.bytetech.util.Login;
import org.bytetech.util.ProfileUtil;
import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) {

        Config config = new Config();
        WebDriver driver = config.getDriver();

        Login.login(("yekeco9355@eoilup.com"), "yekeco@1234", driver);
        Profile profile = ProfileUtil.getProfile("https://www.linkedin.com/in/kunal-kushwaha/", driver);

        driver.close();

//        System.out.println(profile);


//        driver.navigate().to("https://github.com/surajj04");


//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[1]")).sendKeys("standard_user");
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[2]")).sendKeys("secret_sauce");
//        driver.findElement(By.xpath("/html/body/div[1]/div[4]/main/div[1]/div/div/div[2]/div/nav/a[2]")).click();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By.xpath("//main/div[2]/div/div[2]/turbo-frame/div/div[2]/ul/li"))));
//
//        for (WebElement ele : elements) {
//            System.out.println(ele.getText());
//            System.out.println();
//        }
//
//        System.out.println(elements.size());
//        System.out.println(elements.isEmpty());
//
//        driver.close();
    }
}
