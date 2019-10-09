package org.sora.screens.registration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import org.sora.screens.BaseScreen;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneVerificationScreen extends BaseScreen {


    public PhoneVerificationScreen(AppiumDriver driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @AndroidFindBy(id = "registrationVerificationCodeTitleTextView")
    @iOSXCUITFindBy(accessibility = "verificationTitle")
    private MobileElement verificationCodeTitle;

    @AndroidFindBy(id = "registrationVerificationCodeNumberEditText")
    @iOSXCUITFindBy(accessibility = "verificationInput")
    private MobileElement verificationCodeInput;

    @AndroidFindBy(id = "registrationRequestCodeTextView")
    @iOSXCUITFindBy(accessibility = "requestAnotherCodeText")
    private MobileElement requestAnotherCode;

    @AndroidFindBy(id = "registrationVerificationCodeNextButton")
    @iOSXCUITFindBy(accessibility = "nextButton")
    private MobileElement nextButton;

    @iOSXCUITFindBy(accessibility = "resendCodeButton")
    private MobileElement resendCodeButton;



    public void assertTitles(){

        waitUntil(verificationCodeInput);

        assertThat(getTitleText()).isEqualTo("Phone verification");
        assertThat(verificationCodeTitle.getText()).isEqualTo("Enter the code from the SMS");
        assertThat(requestAnotherCode.getText()).startsWith("You can request another code in");
    }

    public void enterVerificationCode(String code){

        waitUntil(verificationCodeInput);
        verificationCodeInput.sendKeys(code);
        closeKeyboard();
    }

    public void clickNext(){

        waitUntil(nextButton);
        nextButton.click();
    }
}
