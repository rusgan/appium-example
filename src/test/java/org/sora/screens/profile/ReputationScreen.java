package org.sora.screens.profile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class ReputationScreen {

    public ReputationScreen(AppiumDriver driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "iv_back")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement backButton;

    @AndroidFindBy(id = "tv_title")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement screenTitle;

    @AndroidFindBy(id = "reputationRankIcon")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement reputationImage;

    @AndroidFindBy(id = "reputationRankText")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement reputationText;

    @AndroidFindBy(id = "dailyVotesText")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement dailyVotes;


    @AndroidFindBy(id = "reputationScreenTitleTextView")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement reputationTitle;

    @AndroidFindBy(id = "reputationScreenDescriptionTextView")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement reputationDescription;

    @AndroidFindBy(id = "reputationScreenCurrentReputationTitleTextView")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement rankupText;

    @AndroidFindBy(id = "firstItemText")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement firrstStep;

    @AndroidFindBy(id = "secondItemText")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement secondStep;

    @AndroidFindBy(id = "projectDetailHeaderImageView")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement projectImage;
}
