package org.sora.screens.registration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import org.sora.screens.BaseScreen;

import static org.assertj.core.api.Assertions.assertThat;

public class ScanQRCodeScreen extends BaseScreen {


    public ScanQRCodeScreen(AppiumDriver driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    /*@AndroidFindBy(id = "permission_allow_button")
    private AndroidElement allowButton;*/

    @AndroidFindBy(id = "onboardingEnterCodeButton")
    @iOSXCUITFindBy(accessibility = "enterCodeManuallyButton")
    private MobileElement enterCodeManuallyButton;

    /*@Step("Grant access to camera")
    public void clickAllowButton(){

        waitUntil(allowButton);
        allowButton.click();
    }*/


    @Step("Click [Enter code manually] button")
    public void clickEnterCodeManuallyButton(){

        waitUntil(enterCodeManuallyButton);
        enterCodeManuallyButton.click();
    }

    @Step("Assert text and titles on \"Scan QR code\" screen")
    public void assertTitles(){

        assertThat(getTitleText()).isEqualTo("Scan QR code");
        assertThat(enterCodeManuallyButton.getText()).isEqualTo("Enter code manually");
    }
}
