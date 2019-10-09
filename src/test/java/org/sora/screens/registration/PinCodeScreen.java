package org.sora.screens.registration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.support.PageFactory;
import org.sora.screens.BaseScreen;

import java.util.List;

public class PinCodeScreen extends BaseScreen {


    public PinCodeScreen(AppiumDriver driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "button")
    private List<MobileElement> pinButtons;

    @AndroidFindBy(id = "tv_title")
    private MobileElement title;

    @AndroidFindBy(id = "pin_code_title")
    private MobileElement pinCodeTitle;

    //TODO
    public void enterPin(int first, int second, int third, int fourth){

            waitUntil(pinCodeTitle);
            waitUntil(pinButtons);
            pinButtons.get(first).click();
            pinButtons.get(second).click();
            pinButtons.get(third).click();
            pinButtons.get(fourth).click();
    }
}
