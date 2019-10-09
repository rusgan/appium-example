package org.sora.screens.registration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import org.sora.screens.BaseScreen;

import static org.assertj.core.api.Assertions.assertThat;

public class PassphraseScreen extends BaseScreen {


    public PassphraseScreen(AppiumDriver driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @AndroidFindBy(id ="mnemonic_title")
    private AndroidElement passphraseTitle;

    @AndroidFindBy(id ="mnemonic_subtitle")
    private AndroidElement passphraseSubtitle;

    @AndroidFindBy(id ="mnemonic_input")
    @iOSXCUITFindBy(accessibility = "passphraseInput")
    private AndroidElement passphraseInput;

    @AndroidFindBy(id = "btn_next")
    @iOSXCUITFindBy(accessibility = "nextButton")
    private MobileElement nextButton;

    @AndroidFindBy(id = "btn_share")
    @iOSXCUITFindBy(accessibility = "shareButton")
    private MobileElement shareButton;


    //TODO
    public void assertTitles(){

        assertThat(getTitleText()).isEqualTo("Passphrase");
        assertThat(passphraseTitle.getText()).isEqualTo("Passphase is a type of password.\nIt is used to recover access to account.");
        assertThat(passphraseSubtitle.getText()).isEqualTo("Write it down ot save it.\nIt cannot be recovered!");
    }

    public String getPassphrase(){

        return passphraseInput.getText();
    }

    public void clickNextButton(){

        waitUntil(nextButton);
        nextButton.click();
    }
}
