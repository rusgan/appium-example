package org.sora.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

public class RecoveryScreen extends BaseScreen {

    public RecoveryScreen(AppiumDriver driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "tv_title")
    protected MobileElement screenTitle;

    @AndroidFindBy(id = "recovery_title")
    @iOSXCUITFindBy
    private MobileElement recoveryTitle;

    @AndroidFindBy(id = "recovery_subtitle")
    private MobileElement recoverySubtitle;

    @AndroidFindBy(id = "mnemonic_input")
    private MobileElement passphraseInput;

    @AndroidFindBy(id = "btn_next")
    @iOSXCUITFindBy
    private MobileElement nextButton;

    @AndroidFindBy(id = "alertTitle")
    private MobileElement errorTitle;

    @AndroidFindBy(id = "message")
    private MobileElement errorMessage;

    @AndroidFindBy(id = "button1")
    private MobileElement okButton;


    @Step("Enter passphrase: {passphrase}")
    public void enterPassphrase(String passphrase){

        passphraseInput.sendKeys(passphrase);
    }

    public String getRecoveryTitleText(){

        waitUntil(recoveryTitle);
        return recoveryTitle.getText();
    }

    public void clickNext(){

        nextButton.click();
    }
}
