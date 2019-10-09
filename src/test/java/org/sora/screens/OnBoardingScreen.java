package org.sora.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.*;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class OnBoardingScreen extends BaseScreen {

    public OnBoardingScreen(AppiumDriver driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    private final String linearLayout = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout";
    private final String firstActionTabBar = linearLayout + "/androidx.appcompat.app.ActionBar.Tab[1]";
    private final String secondActionTabBar = linearLayout + "/androidx.appcompat.app.ActionBar.Tab[2]";
    private final String thirdActionTabBar = linearLayout + "/androidx.appcompat.app.ActionBar.Tab[3]";

    @AndroidFindBy(id = "tutorialTitleTextView")
    @iOSXCUITFindBy(accessibility = "tutorialTitle")
    private MobileElement tutorialTitle;

    @AndroidFindBy(id = "tutorialDescriptionTextView")
    @iOSXCUITFindBy(accessibility = "tutorialDescription")
    private MobileElement tutorialDescription;

    @AndroidFindBy(id = "tutorialSignUpButton")
    @iOSXCUITFindBy(accessibility = "signupButton")
    private MobileElement signUpButton;

    @AndroidFindBy(id = "tutorialRestoreTextView")
    @iOSXCUITFindBy(accessibility = "restoreAccessButton")
    private MobileElement recoveryButton;

    @AndroidFindBy(id = "tutorialTerms")
    @iOSXCUITFindBy(accessibility = "tutorialTerms")
    private MobileElement termsButton;

    @AndroidFindBy(xpath = firstActionTabBar)
    private MobileElement firstActionBar;

    @AndroidFindBy(xpath = secondActionTabBar)
    private MobileElement secondActionBar;

    @AndroidFindBy(xpath = thirdActionTabBar)
    private MobileElement thirdActionBar;


    @Step("Click Sign-up button")
    public void clickSignUp(){

        waitUntil(signUpButton);
        signUpButton.click();
    }

    @Step("Click on recovery button")
    public void clickRecovery(){

        waitUntil(recoveryButton);
        recoveryButton.click();
    }

    @Step("Assert text and titles on screen")
    public void assertTitles(){

        waitUntil(signUpButton);
        assertThat(signUpButton.getText()).isEqualTo("Sign-up");
        assertThat(recoveryButton.getText()).isEqualTo("Restore your account access");
        assertThat(termsButton.getText()).isEqualTo("I have read and agreed to Terms and Conditions");
    }

    @Step("Assert tutorial screens")
    public void assertTutorial(){

        waitUntil(tutorialTitle);
        assertThat(tutorialTitle.getText()).isEqualTo("Projects");
        assertThat(tutorialDescription.getText()).isEqualTo(AssertText.TUTORIAL_PROJECT);
        assertThat(firstActionBar.isSelected()).isEqualTo(true);

        swipeRight();
        assertThat(tutorialTitle.getText()).isEqualTo("Votes");
        assertThat(tutorialDescription.getText()).isEqualTo(AssertText.TUTORIAL_VOTES);

        swipeRight();
        assertThat(tutorialTitle.getText()).isEqualTo("Success");
        assertThat(tutorialDescription.getText()).isEqualTo(AssertText.TUTORIAL_SUCCESS);
    }

    //TODO
    @Step("Assert swipes on \"Onboarding\" screen")
    public void assertSwipe(){

        waitUntil(tutorialTitle);
        assertThat(tutorialTitle.getText()).isEqualTo("Projects");
        assertThat(tutorialDescription.getText()).isEqualTo(AssertText.TUTORIAL_PROJECT);
        assertThat(firstActionBar.isSelected()).isEqualTo(true);

        swipeRight();
        assertThat(tutorialTitle.getText()).isEqualTo("Votes");
        assertThat(tutorialDescription.getText()).isEqualTo(AssertText.TUTORIAL_VOTES);

        swipeRight();
        assertThat(tutorialTitle.getText()).isEqualTo("Success");
        assertThat(tutorialDescription.getText()).isEqualTo(AssertText.TUTORIAL_SUCCESS);
    }
}
