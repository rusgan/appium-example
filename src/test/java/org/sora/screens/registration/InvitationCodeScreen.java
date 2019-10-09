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

public class InvitationCodeScreen extends BaseScreen {


    public InvitationCodeScreen(AppiumDriver driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "invitation_title")
    @iOSXCUITFindBy(accessibility = "invitationalDescription")
    private MobileElement invitationTitle;

    @AndroidFindBy(id = "invitation_input")
    @iOSXCUITFindBy(accessibility = "invitationInput")
    private MobileElement invitationInput;

    @AndroidFindBy(id = "btn_next")
    @iOSXCUITFindBy(accessibility = "nextButton")
    private MobileElement nextButton;


    @Step("Assert text and titles on \"Invitation code screen\"")
    public void assertTitles(){

        assertThat(getTitleText()).isEqualTo("Invitation code");
        assertThat(invitationTitle.getText()).isEqualTo("Enter invitation code");
        assertThat(nextButton.getText()).isEqualTo("Next");
    }

    @Step("Enter invitation code: {code}")
    public void enterInvitationCode(String code){

        invitationInput.sendKeys(code);
    }

    @Step("Click [Next] button")
    public void clickNext(){

        nextButton.click();
    }
}
