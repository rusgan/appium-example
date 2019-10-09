package org.sora.screens.profile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileScreen {

    public ProfileScreen(AppiumDriver driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "title")
    @iOSXCUITFindBy(accessibility = "tutorialTitle")
    private MobileElement projectTitle;

    @AndroidFindBy(id = "how_it_works_card")
    @iOSXCUITFindBy(accessibility = "tutorialTitle")
    private MobileElement helpButton;

    @AndroidFindBy(id = "profileMyReputationTextView")
    @iOSXCUITFindBy(accessibility = "tutorialTitle")
    private MobileElement myReputation;

    @AndroidFindBy(id = "profileVotesTextView")
    @iOSXCUITFindBy(accessibility = "tutorialTitle")
    private MobileElement votes;

    @AndroidFindBy(id = "profileVotesAmount")
    @iOSXCUITFindBy(accessibility = "tutorialTitle")
    private MobileElement votesAmount;

    @AndroidFindBy(id = "profileDetailsTextView")
    @iOSXCUITFindBy(accessibility = "tutorialTitle")
    private MobileElement personalDetails;

    @AndroidFindBy(id = "profilePassphraseTextView")
    @iOSXCUITFindBy(accessibility = "tutorialTitle")
    private MobileElement viewPassphrase;

    @AndroidFindBy(id = "profileConversionTextView")
    @iOSXCUITFindBy(accessibility = "tutorialTitle")
    private MobileElement conversionDisplay;

    @AndroidFindBy(id = "profileConversionName")
    @iOSXCUITFindBy(accessibility = "tutorialTitle")
    private MobileElement currency;

    @AndroidFindBy(id = "profileTermsTextView")
    @iOSXCUITFindBy(accessibility = "tutorialTitle")
    private MobileElement terms;
}
