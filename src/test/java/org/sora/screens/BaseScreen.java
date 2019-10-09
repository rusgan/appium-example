package org.sora.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.sora.utils.DriverSettings.driver;
import static org.sora.utils.DriverSettings.wait;

public class BaseScreen {


    @AndroidFindBy(id = "tv_title")
    protected AndroidElement screenTitle;

    @AndroidFindBy(id = "btn_next")
    protected AndroidElement nextButton;

    @AndroidFindBy(id = "iv_back")
    protected AndroidElement backButton;

    @AndroidFindBy(id = "btn_share")
    private AndroidElement shareButton;

    protected String getTitleText(){

        waitUntil(screenTitle);
        return screenTitle.getText();
    }

    void swipeRight(){


        int x = driver.manage().window().getSize().getWidth();
        int y = driver.manage().window().getSize().getHeight();
        TouchAction action = new TouchAction(driver);
        action.press(new PointOption().withCoordinates(x - 100, y/4))
                .moveTo(new PointOption().withCoordinates( 100, y/4))
                .release()
                .perform();
    }

    protected void scrollDown(){

        int x = driver.manage().window().getSize().getWidth();
        int y = driver.manage().window().getSize().getHeight();
        TouchAction action = new TouchAction(driver);
        action.press(new PointOption().withCoordinates(30, y - y/8))
                .moveTo(new PointOption().withCoordinates( 30, y - (y/8 * 7)))
                .release()
                .perform();
    }

    protected void swipeElemets(MobileElement el1, MobileElement el2){

        TouchAction action = new TouchAction(driver);

        action.press(new PointOption().withCoordinates(el1.getCenter())).moveTo(new PointOption().withCoordinates(el2.getCenter()));
    }

    protected void waitUntil(MobileElement element){

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void waitUntil(List<MobileElement> elements){

        wait.until(ExpectedConditions.visibilityOf((WebElement) elements));
    }

    protected void clickNext(){

        waitUntil(nextButton);
        nextButton.click();
    }

    public void clickBack(){


        waitUntil(backButton);
        backButton.click();
    }

    protected void closeKeyboard(){

        driver.hideKeyboard();
    }
}
