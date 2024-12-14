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
        Profile profile = ProfileUtil.getProfile("https://www.linkedin.com/in/kunal-kushwaha", driver);

        System.out.println(profile);

        driver.close();

    }
}
