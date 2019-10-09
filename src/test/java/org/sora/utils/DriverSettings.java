package org.sora.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;


public class DriverSettings {

    public static AppiumDriver driver;
    public static WebDriverWait wait;
    public static AppiumDriverLocalService service;

    public static void initAndroidDriver() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "pixel3");
        capabilities.setCapability("app", "/apk/app-tst-debug.apk");
        capabilities.setCapability("deviceOrientation", "portrait");
        capabilities.setCapability("automationName", "Espresso");
        capabilities.setCapability("avd","pixel3");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("noReset","true");

        //TODO
        service = AppiumDriverLocalService
                .buildService(new AppiumServiceBuilder()
                        .usingDriverExecutable(new File("/.nvm/versions/node/v12.4.0/bin/node"))
                        .withAppiumJS(new File("/usr/local/lib/node_modules/appium/lib/appium.js")));
        service.start();
        driver = new AndroidDriver(service, capabilities);
    }

    public static void initWait(){

        wait = new WebDriverWait(driver, 10);
    }

    public static void quit(){

        driver.quit();
    }
}
